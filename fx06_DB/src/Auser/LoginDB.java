package Auser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.db.DBClass;
import fx06_DB.memberDTO;

public class LoginDB {
	public memberDTO loginChk(String inputId) {
		//select * from fx_member where id = '?';
		String sql = "select * from fx_member where id = ?";
		memberDTO dto = null;
		try {
			PreparedStatement ps = DBClass.conn.prepareStatement(sql);
			ps.setString(1, inputId);
			//ResultSet는 배열과 비슷한 방식으로 가져온다.
			//ResultSet는 select 문에는 무조건 사용한다.
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new memberDTO();
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
