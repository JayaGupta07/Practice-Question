package javaprogram;
class SingeTask extends Thread{
	public void run() {
		try {
			System.out.println("Single Task is running");
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
// Performing Single Task from Single Thread;
public class SingleTaskSingleThread {

	public static void main(String[] args) {
		SingeTask S1= new SingeTask();
		S1.start();
	}
}
