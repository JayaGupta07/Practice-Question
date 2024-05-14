package Java8_Practice;

import java.util.Comparator;

public class ComparatorInFuntionalInterface implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		
		return b-a;
	}

}
