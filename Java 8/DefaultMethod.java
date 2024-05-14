package Java8_Practice;
interface A{
	default void show() {
		System.out.println("hii i am in 1st interface");
	}
	
}
interface B{
	default void show() {
		System.out.println("hii i am in 2nd interface");
	}
	
}
public class DefaultMethod implements A,B {

	public static void main(String[] args) {
		DefaultMethod t= new DefaultMethod();
        t.show();
	}

	@Override
	public void show() {
		
		B.super.show();
	}	

}
