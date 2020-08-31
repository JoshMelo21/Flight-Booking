/**
 * 
 * @author Josh
 *Flight object
 */
public class Flight {
int flightNumber, capacity, numberOfSeatsLeft;
double originalPrice;
String departureTime, origin, destination;

/**
 * Flight constructor
 * @param flN Flight number 
 * @param cap Capacity
 * @param oP Original Price of flight
 * @param dT Departure time of flight
 * @param og origin of flight
 * @param dest destination of flight
 */
public Flight(int flN, int cap, double oP, String dT, String og, String dest){
	flightNumber = flN;
	capacity = cap;
	originalPrice = oP;
	departureTime = dT;
	destination = dest;
	origin = og;
	numberOfSeatsLeft = cap;
	if(destination.equals(origin)){
		throw new IllegalArgumentException("The destination is the same as the origin");
	}
}
/**
 * Setter method for flight number
 * @param fN new flight number
 */
	public void setFlightNumber(int fN){
		flightNumber = fN;
	}
	/**
	 * Setter method for capacity
	 * @param n new capacity
	 */
	public void setCapacity(int n){
		capacity = n;
	}
	/**
	 * Setter method for remaining seats
	 * @param n new remaining seats
	 */
	public void setNumberOfSeatsLeft(int n){
		numberOfSeatsLeft  = n;
	}
	/**
	 * Setter method for original price
	 * @param n new original price
	 */
	public void setOriginalPrice(double n){
		originalPrice = n;
	}
	/**
	 * setter method for destination
	 * @param a new destination
	 */
	public void setDestination(String a){
		destination = a;
	}
	
	/**
	 * Setter method for origin
	 * @param a new origin
	 */
	public void setOrigin(String a){
		origin = a;
	}
	/**
	 * Setter method for departure time
	 * @param a new departure time
	 */
	public void setDepartureTime(String a){
		departureTime = a;
	}
	
	/**
	 * getter method for flight number
	 * @return flightNumber instance variable
	 */
	public int getFlightNumber(){
		return flightNumber;
	}
	/**
	 * getter method for capacity
	 * @return capacity instance variable
	 */
	public int getCapacity(){
		return capacity;
	}
	/**
	 * getter method for remaining seats
	 * @return numberOfSeatsLeft instance variable
	 */
	public int getNumberOfSeatsLeft(){
		return numberOfSeatsLeft;
	}
	public double getOriginalPrice(){
		return originalPrice;
	}
	/**
	 * getter for departure time
	 * @return departureTime instance variable
	 */
	public String getDepartureTime(){
		return departureTime;
	}
	/**
	 * Getter method for origin
	 * @return origin instance variable
	 */
	public String getOrigin(){
		return origin;
	}
	/**
	 * getter method for destination
	 * @return destination instance variable
	 */
	public String getDestination(){
		return destination;
	}
	
	/**
	 * method to book a seat on the flight
	 * depends on the number of seats remaining on the flight
	 * @return true if there is a seat available, false if there is not
	 */
	public boolean bookASeat(){
		boolean n = false;
		if(numberOfSeatsLeft>0){
			numberOfSeatsLeft--;
			return true;
		}
		return n;
	}
	/**
	 * To string method
	 * @return this object as a string
	 */
	public String toString(){
		
		return "Flight " + flightNumber + ", "+ origin + " to " + destination +", " + departureTime + ", Original Price: " + originalPrice +"$";
	}
	
}
