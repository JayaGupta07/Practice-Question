package javaprogram;

 class Thread1 extends Thread {
	public void run() {
		   try {
	           System.out.println("task 1 is running");
	           
	    }
		   catch(Exception e){
			   System.out.println("Task1 is not running");
		   }
		   
	}
 }
 class Thread2 extends Thread {
	   public void run() {
		   try {
	           System.out.println("task 2 is running");
	           for(int i= 1; i<=5; i++) {
	        	   System.out.println(i+" for task2");
	           }
	    }
		   catch(Exception e){
			   System.out.println("Task2 is not running");
		   }
	}
}
 class Thread3 extends Thread {
	public void run() {
		   try {
	           System.out.println("task 3 is running");
	           for(int i= 1; i<=5; i++) {
	        	   System.out.println(i);
	           }
	    }
		   catch(Exception e){
			   System.out.println("Task3 is not running");	
		   }
	}
} 
 class JoinMethod{
	public static void main(String[] args) throws InterruptedException {
		Thread1 T1 = new Thread1();
		T1.start();
		Thread2 T2 = new Thread2();
		T2.start();
		T2.join();
		Thread3 T3 = new Thread3();
		T3.start();
		   try {
	           System.out.println("main thread is running");
	       }
		   catch(Exception e){
			   System.out.println("main thread is  not running");	   
	         }
  }
}
