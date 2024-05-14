package Java8_Practice;

interface Static{
	static void Hello() {
		System.out.println("Hello i am here!");
	}
	
	default void Bye() {
		System.out.println("Byeeeee!");
	}
}

public class StaticMethods implements Static {

	public static void main(String[] args) {
		 StaticMethods Sm = new  StaticMethods();
		 Static.Hello();
		 Sm.Bye();
	}

}
