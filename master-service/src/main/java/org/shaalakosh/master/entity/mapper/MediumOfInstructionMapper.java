package org.shaalakosh.master.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.shaalakosh.master.model.MediumOfInstruction;
import org.springframework.jdbc.core.RowMapper;

public class MediumOfInstructionMapper implements RowMapper<MediumOfInstruction> {

	@Override
	public MediumOfInstruction mapRow(ResultSet rs, int arg1) throws SQLException {
		MediumOfInstruction mediumOfInstruction = new MediumOfInstruction();
		mediumOfInstruction.setInstructionID(rs.getInt("InstructionID"));
		mediumOfInstruction.setInstructionCode(rs.getString("InstructionCode"));
		mediumOfInstruction.setInstructionDesc(rs.getString("InstructionDesc"));
		mediumOfInstruction.setActive(rs.getBoolean("IsActive"));	

		return mediumOfInstruction;
	}

}
