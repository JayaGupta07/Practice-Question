package Java8_Practice;
import java.util.function.Predicate;
public class PredicateUsingAND {

	public static void main(String[] args) {
		Predicate<String> startswithletterJ = name -> name.toLowerCase().charAt(0)=='j';
        Predicate<String> endswithletterA = name -> name.toLowerCase().charAt(name.length()-1)=='a';
        Predicate<String> and = startswithletterJ.and(endswithletterA);
        System.out.println(and.test("Jaya"));
        System.out.println(and.test("Gitika"));
	}

}
