package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root","Jaya@7828");
		PreparedStatement ps= Connect.prepareStatement("update register set city=? where email=?");
		String city1 = "pune";
		String email1 = "gitika@gmail.com";
		ps.setString(1, city1 );
		ps.setString(2, email1);
		
		int count =ps.executeUpdate();
		if(count> 0) {
			System.out.println("Successsfully Updated!");
		}
		else {
			System.out.println("Error!");
		}

	}

}
