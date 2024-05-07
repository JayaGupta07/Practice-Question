package synchronization;
//By using wait(), notify(), notifyAll() method

class TotalEarning extends Thread{
	 int Total=0;
	 public void run() {
		 synchronized(this) {
			 for(int i=1; i<=10; i++) {
				 	Total =	Total + 100;
			 }
			 this.notify();
		 }
	 }
}

public class MovieTicketApp {

	public static void main(String[] args) throws InterruptedException {
		TotalEarning TE= new TotalEarning();
		TE.start();
		synchronized(TE) {
			TE.wait();
			System.out.println("Total Earning is "+ TE.Total + "Rs"); 
		}

	}

}
