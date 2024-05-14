package Java8_Practice;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample2 {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(2);
        s.add(15);
        System.out.println("Before sorting : "+ s);
        Set<Integer> s2 = new TreeSet<>((a, b) -> b-a);
        s2.add(25);
        s2.add(2);
        s2.add(15);
        System.out.println("After sorting : "+ s2);
	}

}
