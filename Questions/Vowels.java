
public class Vowels {

	public static void main(String[] args) {
		String name= "JayaGupta";
		int length= name.length();
		for(int i=0; i<length; i++){
		if(name.charAt(i) == 'a' || name.charAt(i) == 'e' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u') {
		  System.out.println("The vowels is " + name.charAt(i));
		 } 
		}
	}

}
