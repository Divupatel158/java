W.A.J.P to creat an app for movie theatar ( book the tickets, cancle the tickets )
//27-09-2023
package oops3;
class movie{
	int total_ticket=100;	//global non static variable
	void ticketBooking(int m) {
		if(m<=total_ticket) {
			total_ticket -=m;
			System.out.println(m+" Tickets booked");
		}
		else {System.out.println(" show is full");}
	}
	void cancelTicket(int n) {
		total_ticket+=n;
		System.out.println(n+" ticket canceled");
	}
	void ticketsAvailable() {
		System.out.println("Available ticket "+total_ticket);
	}
}
public class InoxMovies {
	public static void main(String[] args) {	
		movie m1= new movie();
		m1.ticketsAvailable();
		m1.ticketBooking(10);
		m1.ticketsAvailable();
		m1.cancelTicket(5);
		m1.ticketsAvailable();
		m1.ticketBooking(15);
		m1.ticketsAvailable();
		m1.ticketBooking(80);
		m1.ticketsAvailable();
		m1.ticketBooking(5);
		m1.cancelTicket(20);
		m1.ticketsAvailable();
		m1.ticketBooking(10);
		m1.ticketsAvailable();
	}
}
//output:-
//Available ticket 100
//10 Tickets booked
//Available ticket 90
//5 ticket canceled
//Available ticket 95
//15 Tickets booked
//Available ticket 80
//80 Tickets booked
//Available ticket 0
// show is full
//20 ticket canceled
//Available ticket 20
//10 Tickets booked
//Available ticket 10
