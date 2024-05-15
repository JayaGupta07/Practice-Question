package Java8_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

//1st example
		Predicate<Integer> SalaryCheck = x -> x > 100000;
		System.out.println( SalaryCheck.test(90000));
		
//2nd example
		Predicate<Integer> isEven = a -> a% 2 == 0;
		List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Without using stream
		
		for(Integer i : l) {
			if(isEven.test(i)) {
				System.out.println(i);
			}
		}
	
//3rd example		
       Predicate<String> StartsWithJ = name -> name.toLowerCase().charAt(0)=='j';
       System.out.println(StartsWithJ.test("Jaya"));
       System.out.println(StartsWithJ.test("Gitika"));
	}
	

}
