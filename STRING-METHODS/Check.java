
public class Check {

	public static void main(String[] args) {
		String str1 = "Something";                        
		String str2 = new String("Something");     
		str2.intern();                                       
		System.out.println(str1 == str2);
	}

}
