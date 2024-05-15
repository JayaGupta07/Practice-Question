package Java8_Practice;

import java.util.function.Predicate;

public class PredicateUsingNegate {

	public static void main(String[] args) {
		Predicate<String> startswithletterJ = name -> name.toLowerCase().charAt(0)=='j';
        System.out.println(startswithletterJ.negate().test("Jaya"));
        System.out.println(startswithletterJ.negate().test("Gitika"));
	}

}
