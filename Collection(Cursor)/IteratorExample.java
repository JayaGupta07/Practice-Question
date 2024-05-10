package Cursors;
import java.util.ArrayList;
import java.util.Iterator;

//Example of Iterator
public class IteratorExample {

	public static <L> void main(String[] args) {
		ArrayList<Object> L = new ArrayList<Object>();
		L.add(100);
		L.add(200);
		L.add(300);
		System.out.println(L);
		Iterator<Object> itr = L.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
