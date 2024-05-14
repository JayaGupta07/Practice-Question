package Java8_Practice;

public class TestThreadUsingLamda {

	public static void main(String[] args) {
			Runnable runnable = () ->{
				for(int i=1 ; i<=10; i++) {
					System.out.println("Jaya");
				}
			};
           Thread threadcheck = new Thread(runnable);
           threadcheck.run();
           
}
}
