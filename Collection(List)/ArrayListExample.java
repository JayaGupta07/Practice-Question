package collection;
import java.util.ArrayList;
public class ArrayListExample {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		 for (int i = 1; i <= n; i++) {
	            arr1.add(i);
	        }
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.indexOf(2)); 
		 System.out.println("Array:- " + arr1.lastIndexOf(arr1));
		 System.out.println("Array:- " + arr1.size());
		 System.out.println("Array:- " + arr1.toString()); 
		 System.out.println("Array:- " + arr1.get(4));
		 System.out.println("Array:- " + arr1.getFirst());
		 System.out.println("Array:- " + arr1.getLast());
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.remove(3));
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.removeFirst());
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.removeLast());
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.set(0, 1));
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.add(2));
		 System.out.println("Array:- " + arr1);
		 System.out.println("Array:- " + arr1.contains(2));
		 System.out.println("Array:- " + arr1.isEmpty());
		 System.out.println("Array:- " + arr1);
		 
		 ArrayList<Integer> arr2 = new ArrayList<Integer>(n);
		 arr2.add(4);
		 arr2.add(5);
		 System.out.println(arr2);
		 arr1.addAll(arr2);
		 System.out.println(arr1);
		 arr1.removeAll(arr2 );
		 System.out.println(arr1);
		 arr1.clear();
		 System.out.println(arr1);
		 
		 
	}

}
