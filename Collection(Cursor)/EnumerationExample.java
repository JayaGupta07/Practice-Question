package Cursors;
import java.util.Enumeration;
import java.util.Vector;

// Example of Enumeration 

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Jaya");
		v.add("Gupta");
		System.out.println(v);
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
			
		}
	}

}
