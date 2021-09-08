package database;

import java.sql.Connection;
import java.sql.DriverManager;

import javafx.scene.Parent;

public class DBClass {
	

	public static Connection conn;
	
	public DBClass() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "tmd0915mp", "0915");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
