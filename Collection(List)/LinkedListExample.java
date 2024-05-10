package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Comparable> l = new  LinkedList<Comparable>();
		l.add(10);
		l.add(20);
		l.add("Jaya");;
		l.add("Gupta");
		System.out.println(l);
		l.add(2,30);
		System.out.println(l);
		l.add(0, 5);
		System.out.println(l);
		l.addFirst(0);
		System.out.println(l);
		System.out.println(l.contains("Jaya"));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.isEmpty());
		System.out.println(l.lastIndexOf("Gupta"));
		System.out.println(l.size());
		System.out.println(l.equals(7));
		System.out.println(l.remove(0));
		System.out.println(l);
		l.remove(4);
		System.out.println(l);
		l.set(4, 40);
		System.out.println(l);
		
		LinkedList<Comparable> l2 = new  LinkedList<Comparable>();
		l2.add(50);
		l2.add(60);;
		
		System.out.println(l2);
		l.addAll(l2);
		System.out.println(l);
	
	}

}
