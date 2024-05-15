package Java8_Practice;

import java.util.function.Predicate;

public class PredicateUsingOr {

	public static void main(String[] args) {
		Predicate<String> startswithletterJ = name -> name.toLowerCase().charAt(0)=='j';
        Predicate<String> endswithletterA = name -> name.toLowerCase().charAt(name.length()-1)=='a';
        Predicate<String> or = startswithletterJ.or(endswithletterA);
        System.out.println(or.test("Jaya"));
        System.out.println(or.test("Gitika"));

	}

}
