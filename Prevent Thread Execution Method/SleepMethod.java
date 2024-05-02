package javaprogram;
class Sleep extends Thread {
	public void run() {
		try {
			System.out.println("Single Task is running");
			for(int i=1; i<=5; i++) {
				Sleep.sleep(2000);
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class SleepMethod {

	public static void main(String[] args) {
		Sleep s = new Sleep();
		s.start();
	}

}
