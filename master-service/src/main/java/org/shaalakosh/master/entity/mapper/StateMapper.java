package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.State;
import org.springframework.jdbc.core.RowMapper;

public class StateMapper implements RowMapper<State> {

	@Override
	public State mapRow(ResultSet rs, int arg1) throws SQLException {
		State state = new State();
		state.setStateID(rs.getInt("stateID"));
		state.setActive(rs.getBoolean("isActive"));
		state.setCreatedByUserId(rs.getInt("createdByUserId"));
		state.setCreatedDate(rs.getDate("createdDate"));
		state.setIsdefaultState(rs.getBoolean("isDefaultState"));
		state.setStateCode(rs.getString("StateCode"));
		state.setUpdatedDate(rs.getDate("updatedDate"));
		state.setUpdatedByUserId(rs.getInt("UpdatedByUserID"));
		state.setUdisestatecode(rs.getString("UdiseStateCode"));
		state.setLadstatecode(rs.getString("LgdStateCode"));
		//state.setStateID(rs.);
		/*user.setUserId(rs.getLong("user_id"));
		user.setEmail(rs.getString("email"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));		
		user.setPassword(rs.getString("password"));
		user.setCreated(rs.getDate("created"));*/
		return state;
	}
	

}
