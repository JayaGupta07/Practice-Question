package Java8_Practice;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
	Function<String , String> func1 = 	s -> s.toUpperCase();
	Function<String , String> func2 = 	s -> s.substring(0 ,4);
	System.out.println(func1.andThen(func2).apply("Jayaaaaa"));
	}

}
