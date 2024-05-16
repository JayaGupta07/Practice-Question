package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String email1 = "vartika@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root" , "Jaya@7828");
        PreparedStatement ps = Connect.prepareStatement("delete from register where email=?");
        
        ps.setString(1, email1);
        int count = ps.executeUpdate();
        if (count > 0) {
        	System.out.println("Deleted Successfully!");
        }
        else {
        	System.out.println("Error!");
        }
	}

}
