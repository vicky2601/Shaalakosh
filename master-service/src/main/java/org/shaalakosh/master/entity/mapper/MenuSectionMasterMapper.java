package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.shaalakosh.master.model.MenuSectionMaster;
import org.springframework.jdbc.core.RowMapper;

public class MenuSectionMasterMapper implements RowMapper<MenuSectionMaster> {

	@Override
	public MenuSectionMaster mapRow(ResultSet rs, int arg1) throws SQLException {
		MenuSectionMaster section = new MenuSectionMaster();
		section.setMenuID(rs.getInt("MenuID"));
		section.setMenuSection(rs.getString("MenuSection"));
		section.setMenuSectionID(rs.getInt("MenuSectionID"));
		section.setActive(rs.getBoolean("IsActive"));
		return section;
	}
	

}
