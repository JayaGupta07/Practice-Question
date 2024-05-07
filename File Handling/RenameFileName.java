package Handling;
import java.io.*;

public class RenameFileName {

	public static void main(String[] args) {
		File oldname = new File("C:\\Users\\Jaya\\Desktop\\Jaya.txt");
		File newname = new File("C:\\Users\\Jaya\\Desktop\\Jaya2.txt");
		if(oldname.exists()) {
			System.out.println(oldname.renameTo(newname) +"File name is successfully changed." );
		}
		else {
			System.out.println("File does not exist.");
		}
		
	}

}
