/**
 * 
 * @author Josh
 *Ticket Object, has-a flight and passenger object
 */
public class Ticket {
Passenger p;
Flight flight;
double price;
int number;
static int statNumber = 0;;
	/**
	 * Ticket Constructor
	 * @param p Passenger purchasing the ticket
	 * @param flight What Flight the ticket is for
	 * @param price Price of the ticket
	 */
	public Ticket(Passenger p, Flight flight, double price){
		this.p =p;
		this.flight= flight;
		this.price = price;
		number = statNumber;
		statNumber++;
	}
	/**
	 * Setter method for Passenger p
	 * @param p Passenger who has the ticket
	 */
	public void setPassenger(Passenger p){
		this.p=p;
	}
	/**
	 * Setter method for Flight flight
	 * @param f Flight the ticket is for
	 */
	public void setFlight(Flight f){
		flight =f;
	}
	/**
	 * Setter method for price
	 * @param d price of the ticket
	 */
	public void setPrice(double d){
		price =d;
	}
	/**
	 * Setter method for ticket number
	 * @param n new number for ticket (Should not be a pre-existing ticket number)
	 */
	public void setNumber(int n){
		number = n;
	}
	/**
	 * Getter method for Passenger
	 * @return Passenger p instance variable
	 */
	public Passenger getPassenger(){
		return p;
	}
	
	/**
	 * Getter method for Flight
	 * @return Flight f instance variable
	 */
	public Flight getFlight(){
		return flight;
	}
	/**
	 * Getter method for Price instance variable
	 * @return price
	 */
	public double getPrice(){
		return price;
	}
	/**
	 * Getter method for ticket number
	 * @return ticket number
	 */
	public int getNumber(){
		return number;
	}
	/**
	 * To string method
	 * @return this object as a string
	 */
	public String toString(){
		return p.getName() + ", " + flight.toString() + " New Price: " + price + "$";
	}
	
}
