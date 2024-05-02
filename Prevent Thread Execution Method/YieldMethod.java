package javaprogram;
class Yield extends Thread{
	public void run() {
		try {
			//Yield.yield();
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
public class YieldMethod {

	public static void main(String[] args) {
		Yield y = new Yield();
		y.start();
		Yield.yield();
		try {
			System.out.println("Main Task is running");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
