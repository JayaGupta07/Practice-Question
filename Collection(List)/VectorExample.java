package collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Jaya");
		v.add("Gitika");
		v.add("Nandini");
		
        System.out.println(v);
        v.add("Kanika");
        System.out.println(v);
        v.add(3, "Ekta");
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.getFirst());
        System.out.println(v.firstElement());
        System.out.println(v.isEmpty());
        System.out.println(v.clone());
        System.out.println(v.lastIndexOf("Ekta"));
        System.out.println(v.elementAt(2));
        System.out.println(v.toArray());
    
	}

}
