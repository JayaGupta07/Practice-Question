package Java8_Practice;

import java.util.function.Function;

public class FuntionInterfaceUsingApply {

	public static void main(String[] args) {
		
//1st Example
		Function<String, Integer> func = x -> x.length();
		System.out.println(func.apply("Jaya"));
		
//2nd Example
		Function<String, String> s2 = name -> name.substring(0, 3);
		System.out.println(s2.apply("jaya"));
	}

}
