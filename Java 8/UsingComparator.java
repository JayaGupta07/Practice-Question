package Java8_Practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class UsingComparator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		
		Collections.sort(list) ;
		System.out.println(list);
}

}
