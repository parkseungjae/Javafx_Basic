package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import count.CountImpl;
import javafx.scene.Parent;

public class DBClass {
	
	CountImpl ci;
	public static Connection conn;
	
	public DBClass() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "tmd0915mp", "0915");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int insert(answerDTO dto) {
		String sql = "insert into fx_member(trip,age,gender) values(?,?,?)";
		int result = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getTrip());
			ps.setString(2, dto.getAge());
			ps.setString(3, dto.getGender());
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
}
