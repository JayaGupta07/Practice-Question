package Java8_Practice;

public class LamdaExpression {

	public static void main(String[] args) {
		Employee employee = () -> "Software Developer";
		System.out.println(employee.getName());
	}
}
