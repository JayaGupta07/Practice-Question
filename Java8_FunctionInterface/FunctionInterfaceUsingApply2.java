package Java8_Practice;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Students{
	private int id;
	private String name;
	
	public Students (int id, String name) {
		this.id= id;
		this.name= name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student{" + "id=" +id + " , name" + name + '\'' +   "}";
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id= id;
	}
	public void setname(String name) {
		this.name= name;
	}
	public String getname() {
		return name;
	}
	
}

public class FunctionInterfaceUsingApply2 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"jaya");
		Student s2 = new Student(1,"Gitika");
     	Student s3 = new Student(1,"jayu");
     	List<Student> student =Arrays.asList(s1,s2,s3);
     	Function<String, String> starting3letters = name -> name.substring(0, 3);
     	Function<List<Student>, List<Student>> Nameprefix = li -> {
     		for(Student name:li) {
     			if(starting3letters.apply(name.getname()).equalsIgnoreCase("jay")) {
     				return add(name);
     			}
     		}
			return li;
     		
     	};
     	

	}

	private static List<Student> add(Student name) {
		// TODO Auto-generated method stub
		return null;
	}

}
