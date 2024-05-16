 package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
  import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserNidhitValuesFromUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Jaya@7828");
		
		PreparedStatement ps=Connect.prepareStatement("Insert register values(?,?,?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name here :");
		String name3 = br.readLine();
		System.out.println("Enter Email here :");
		String email3 = br.readLine();
		System.out.println("Enter password here :");
		String password3 = br.readLine();
		System.out.println("Enter gender here :");
		String gender3= br.readLine();
		System.out.println("Enter city here :");
		String city3= br.readLine();
		
		
		ps.setString(1, name3);
		ps.setString(2, email3);
		ps.setString(3, password3);
		ps.setString(4, gender3);
		ps.setString(5, city3);
		
		
        int i = ps.executeUpdate();
        if(i>0) {
        	System.out.println("Successfully Updated");
        }
        else {
        	System.out.println("Failed");
        }
		
	}

}
