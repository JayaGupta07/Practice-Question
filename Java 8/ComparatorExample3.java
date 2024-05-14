package Java8_Practice;

import java.util.Map;
import java.util.TreeMap;

public class ComparatorExample3 {

	public static void main(String[] args) {
		Map<Integer , String> m = new TreeMap<>();
        m.put(2, "A");
        m.put(1, "J");
        m.put(3, "Y");
        System.out.println("Before sorting : "+ m);
        
        Map<Integer , String> m2 = new TreeMap<>((a,b) -> b-a);
        m2.put(2, "A");
        m2.put(1, "J");
        m2.put(3, "Y");
        System.out.println("Before sorting : "+ m2);
        
        
        
	}

}
