package Java8_Practice;

import java.util.function.Function;

public class FunctionInterFaceUsingCompose {

	public static void main(String[] args) {
		Function<Integer, Integer> func1 = a -> a*2;
		Function<Integer, Integer> func2 = a -> a*2*3;
		
		System.out.println(func1.andThen(func2).apply(5));	//60	
		System.out.println(func2.andThen(func1).apply(4));  //48
		
		System.out.println(func1.compose(func2).apply(4));  //48

	}

}
