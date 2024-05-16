 package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Jaya@7828");
        PreparedStatement ps = connect.prepareStatement("select * from register");
        ResultSet result= ps.executeQuery();
         while(result.next()) {
        	 String name1 = result.getNString("name");
        	 System.out.println("Name : "+name1);
        	 String email1 = result.getNString("email");
        	 System.out.println("Email :"+email1);
        	 String password1 = result.getNString("password");
        	 System.out.println("Password : "+password1);
        	 String gender1 = result.getNString("gender");
        	 System.out.println("Gender : "+gender1);
        	 String city1 = result.getNString("city");
        	 System.out.println("City : "+city1);
        	 
         }
	}

}
