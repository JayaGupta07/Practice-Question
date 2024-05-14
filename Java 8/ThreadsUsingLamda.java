package Java8_Practice;

public class ThreadsUsingLamda implements Runnable{

	@Override
	public void run() {
		for(int i=1 ; i<=10; i++) {
			System.out.println("Jaya");
		}
		
	}

}
