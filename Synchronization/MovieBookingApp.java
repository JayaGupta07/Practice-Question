package synchronization;
//by using static synchronization

class TicketBooking{
	static int Total_Seats =20;
	synchronized void SeatBooking(int Seats){
		if(Total_Seats>=Seats) {
			System.out.println(Seats + " seats booked successfully.");
			Total_Seats = Total_Seats  - Seats;
			System.out.println(Total_Seats + " seats are left.");	
		}
		else {
			System.out.println(Seats +" seats can not be booked.");
			System.out.println(Total_Seats + " seats are left.");
		}
	}
}
class Myticket1 extends Thread{
	TicketBooking T;
	int Seats;
	Myticket1(TicketBooking T, int Seats){
		this.T=T;
		this.Seats= Seats;
	}
	public void run() {
		T.SeatBooking(Seats);
	}
}
class Myticket2 extends Thread{
	TicketBooking T;
	int Seats;
	Myticket2(TicketBooking T, int Seats){
		this.T=T;
		this.Seats= Seats;
	}
	public void run() {
		T.SeatBooking(Seats);
	}
}
public class MovieBookingApp {

	public static void main(String[] args) {
		TicketBooking T = new TicketBooking();
		Myticket1 T1 =new Myticket1(T,7);
		T1.start();
		Myticket1 T2 =new Myticket1(T,3);
		T2.start();
		
		TicketBooking t = new TicketBooking();
		Myticket1 T3 =new Myticket1(t,5);
		T3.start();
		Myticket1 T4 =new Myticket1(t,8);
		T4.start();

	}

}
