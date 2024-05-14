package Java8_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(2 , "Jaya");
		Student s2 = new Student(3 , "jay");
		Student s3 = new Student(22 , "Jayaaa");
		List<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		Collections.sort(li, (a , b) -> b.id - a.id);
		System.out.println(li);

	}

}
