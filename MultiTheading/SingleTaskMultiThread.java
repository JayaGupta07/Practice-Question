package javaprogram;
class SingleTaskMulThread extends Thread{
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
//Performing Single Task from Multiple Thread
public class SingleTaskMultiThread {

	public static void main(String[] args) {
		System.out.println("Here single task is running by multyple thereads:");
		SingleTaskMulThread s1= new SingleTaskMulThread();
		s1.start();
		SingleTaskMulThread s2= new SingleTaskMulThread();
		s2.start();
		SingleTaskMulThread s3 = new SingleTaskMulThread();
		s3.start();
	}
}
