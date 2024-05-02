package javaprogram;
class BasicMethod extends Thread{
	public void run() {
	 Thread.currentThread().setName("Jaya");
	 System.out.println(Thread.currentThread().getName());
	 System.out.println("Thread1");		
	}
}
public class BasicMethods {

	public static void main(String[] args) {
		BasicMethod m= new BasicMethod();
		m.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(m.isAlive());
	}
}
