package javaprogram;
class ThreadTask1 extends Thread{
	public void run() {
		try {
			System.out.println("Task1 is running");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class ThreadTask2 extends Thread{
	public void run() {
		try {
			System.out.println("Task2 is running");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class MultipleTaskMultipleThread {

	public static void main(String[] args) {
		    ThreadTask1 T1= new ThreadTask1();
			T1.start();
			ThreadTask2  T2= new ThreadTask2 ();
			T2.start();
	}
}
