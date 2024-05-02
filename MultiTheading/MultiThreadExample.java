package javaprogram;
class Threads extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class MultiThreadExample {

	public static void main(String[] args) {
		Threads Th= new Threads();
		Th.start();
	}
}
