package javaprogram;
class Name extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is old name of Thread");
	}
}
public class NamingMethods {

	public static void main(String[] args) {
		Name N= new Name();
		N.start();
		N.setName("Thread1");
		System.out.println(Thread.currentThread().getName());

	}

}
