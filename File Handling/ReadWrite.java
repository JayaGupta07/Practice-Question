package Handling;
import java.io.*;
import java.io.BufferedWriter;
public class ReadWrite {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Jaya\\Desktop\\Jaya.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
	            bw.write("This is first line.");
	            bw.newLine();
	            bw.write("This is second line.");
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}
