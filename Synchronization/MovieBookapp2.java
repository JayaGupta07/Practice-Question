package synchronization;
//By using synchronized block

class Bookseats {
	int TotalSeats=10;
	void Bookseat(int Seats) {
		System.out.println("Ticket Booking Here.");
		synchronized(this){
			if(TotalSeats>=Seats) {
				System.out.println(Seats + " seats booked successfully.");
				TotalSeats=TotalSeats - Seats;
				System.out.println(TotalSeats + " seats are left.");	
			}
			else {
				System.out.println(Seats +" seats can not be booked.");
				System.out.println(TotalSeats + " seats are left.");
			}
		}
	}
}

public class MovieBookapp2 extends Thread{
	static Bookseats b;
	int Seats;
	public void run(){
		b.Bookseat(Seats);
	}

	public static void main(String[] args) {
		b= new Bookseats();
		MovieBookapp2 Jaya = new MovieBookapp2();
		Jaya.Seats = 7;
		Jaya.start();
		
		MovieBookapp2 Jayu = new MovieBookapp2();
		Jayu.Seats = 6;
		Jayu.start();
	}

}
