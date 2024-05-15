package Java8_Practice;
import java.util.function.Predicate; 

public class PredicateUsingIsEqual {

	public static void main(String[] args) {
		Predicate<Object> predicate = Predicate.isEqual("Jaya");
        System.out.println(predicate.test("Jaya"));
        System.out.println(predicate.test("Gitika"));
	}

}
