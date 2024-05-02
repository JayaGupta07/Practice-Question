package javaprogram;
class Priority extends Thread{
	public void run() {
		 Thread.currentThread().setName("Jaya");
		 System.out.println(Thread.currentThread().getName()+ " is Thread1");	
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		 System.out.println(Thread.currentThread().getPriority()+ " is the priority of main thread.");
		 Priority P= new Priority();
		 P.start();
		 System.out.println(P.getPriority()+" is the OLD priority of jaya thread.");//in that case child inherit parents class property
		 P.setPriority(10);
		 System.out.println(P.getPriority()+" is the NEW priority of jaya thread.");

	}

}
