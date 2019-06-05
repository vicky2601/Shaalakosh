package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.shaalakosh.master.model.Menu;
import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<Menu> {

	@Override
	public Menu mapRow(ResultSet rs, int arg1) throws SQLException {
		Menu menu = new Menu();
		menu.setActive(rs.getBoolean("IsActive"));
		menu.setCreatedDate(rs.getDate("CreatedDate"));
		menu.setDocumentID(rs.getInt("DocumentID"));
		menu.setIconUrl(rs.getString("IconUrl"));
		menu.setLevelID(rs.getInt("LevelID"));
		menu.setMenu(rs.getString("Menu"));
		menu.setMenuCode(rs.getString("MenuCode"));
		menu.setMenuID(rs.getInt("MenuID"));
		menu.setMenuTypeID(rs.getInt("MenuTypeID"));
		menu.setParentID(rs.getInt("ParentID"));
		menu.setRootID(rs.getInt("RootID"));
		menu.setSortOrder(rs.getInt("SortOrder"));
		menu.setTargetURL(rs.getString("TargetURL"));
		return menu;
	}
	

}
