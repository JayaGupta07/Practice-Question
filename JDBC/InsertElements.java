package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.*;


public class InsertElements {

	public static <BufferReader> void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//load & Register driver class		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
// Creating Connection		
		Connection Connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Jaya@7828");

        //User values
		String name2= "Nidhi";
		String email2="Nidhi@gmail.com";
		String password2 = "nidhi123";
		String gender2 = "female";
		String city2 = "Indore"; 
		
// Preparing Statements
		//PreparedStatement ps=Connect.prepareStatement("Insert register values('"+name2+"', '"+email2+"', '"+password2+"', '"+gender2+"', '"+city2+"')"); 
		
        //PreparedStatement ps1=Connect.prepareStatement("Insert register values('Jaya', 'jaya@gmail.com', 'jaya123', 'female', 'indore')"); 
		
		PreparedStatement ps=Connect.prepareStatement("Insert register values(?,?,?,?,?)");
		ps.setString(1, name2);
		ps.setString(2, email2);
		ps.setString(3, password2);
		ps.setString(4, gender2);
		ps.setString(5, city2);
		
//Executing Statements		
        int i = ps.executeUpdate();
        if(i>0) {
        	System.out.println("Successfully Updated");
        }
        else {
        	System.out.println("Failed");
        }
	}

}
