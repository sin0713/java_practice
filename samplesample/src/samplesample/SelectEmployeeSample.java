
package samplesample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEmployeeSample {
	 public static void main(String[] args) {
		 try (Connection conn = DriverManager.getConnection (
		  		"jdbc:h2:tcp://localhost/~/example", "sa", "")) {

		  	String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
		  	PreparedStatement pStmt = conn.prepareStatement(sql);
		  	
		  	ResultSet rs = pStmt.executeQuery();
		  	while (rs.next()) {
		  		String id = rs.getString("ID");
		  		String name = rs.getString("NAME");
		  		int age = rs.getInt("AGE");
		  		
		  	}
		  	




		 }
	}
}
