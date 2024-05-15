package Java8_Practice;

import java.util.function.Function;

public class FunctionInterfaceUsingIdentity {

	public static void main(String[] args) {
		Function<String, String> IdentityFunction = Function.identity();
		System.out.println(IdentityFunction.apply("Jayaaaa"));

	}

}
