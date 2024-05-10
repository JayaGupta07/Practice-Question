package Cursors;
import java.util.ArrayList;
import java.util.ListIterator;

//Example of ListIterator
public class ListIteratorExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Object> L = new ArrayList<Object>();
		L.add("Jaya");
		L.add("Gupta");
		System.out.println(L);
		ListIterator li = L.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
			
		}
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(L);
	    

	}

}
