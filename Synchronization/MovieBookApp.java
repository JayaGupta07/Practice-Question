package synchronization;
//By Using Synchronized method

class BookTheaterSeats {
	int total_seats = 10;
	
	synchronized void BookSeats(int seats) {
		if(total_seats>=seats) {
			System.out.println(seats + " seats booked successfully.");
			total_seats=total_seats - seats;
			System.out.println(total_seats + " seats are left.");	
		}
		else {
			System.out.println(seats +" seats can not be booked.");
			System.out.println(total_seats + " seats are left.");
		}
	}
}
public class MovieBookApp extends Thread {
 
    static BookTheaterSeats B;
	int seats;
	public void run() {
		B.BookSeats(seats);
	}
	public static void main(String[] args) {
		B = new BookTheaterSeats();
		MovieBookApp jaya = new  MovieBookApp();
	    jaya.seats= 7;
	    jaya.start();
	    
	    MovieBookApp jayu = new  MovieBookApp();
	    jayu.seats= 6;
	    jayu.start();
	}

}
