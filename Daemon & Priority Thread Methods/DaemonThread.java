package javaprogram;
class DaemonMethods extends Thread{
	 public void run() {
	        if(Thread.currentThread().isDaemon())
	        {
	            System.out.println(getName() + " is Daemon thread");
	        }
	         
	        else
	        {
	            System.out.println(getName() + " is User thread");
	        }
	 }    
}
public class DaemonThread {

	public static void main(String[] args) {
		Thread.currentThread().setName("jaya"); 
		System.out.println(Thread.currentThread().getName() + " is main thread");
		DaemonMethods D= new DaemonMethods();
		D.setDaemon(true);
		D.start();
	}
}