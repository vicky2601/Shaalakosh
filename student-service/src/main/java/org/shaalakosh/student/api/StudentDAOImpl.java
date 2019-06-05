package org.shaalakosh.student.api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAOImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void testConnection() {
		List<String> arrayDataList = jdbcTemplate.query("Select * from mst_state",
				new ResultSetExtractor<List<String>>() {
					@Override
					public List<String> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
						List<String> list = new ArrayList<String>();
						while (resultSet.next()) {
							list.add(resultSet.getString(1));
						}
						return list;
					}
				});
		for (int i = 0; i < arrayDataList.size(); i++) {
			System.out.println(arrayDataList.get(i));
		}
	}
}
