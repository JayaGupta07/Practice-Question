package Java8_Practice;

public class TestThread {

	public static void main(String[] args) {
		 ThreadsUsingLamda th = new  ThreadsUsingLamda();
		 Thread thread = new Thread(th);
		 thread.run();

	}

}
