package Handling;
import java.io.*;

public class Filehandling {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Jaya\\Desktop\\Jaya.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Sucessfully Create");
			}
			else {
				System.out.println("File Already exist..");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled..!");
		}


	}

}
