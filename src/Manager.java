import java.util.*;
/**
 * 
 * @author Josh
 *Manager object
 *has-a Flight objects and Ticket objects
 */
public class Manager {
ArrayList<Flight> flights;
ArrayList<Ticket> tickets;
/**
 * Manager constructor
 * initializes array list of Tickets and Flights
 */
  public Manager(){
	  flights = new ArrayList<Flight>();
	  tickets = new ArrayList<Ticket>();
  }

  /**
   * Method to create Flights which can be purchased by Members or NonMembers
   * fills array of Flights with created flights
   */
  public void createFlights(){
	  Flight f1 = new Flight(1, 1, 900, "7am", "Toronto", "Ottawa");
	  Flight f2 = new Flight(2, 2, 800, "9am", "Calgary", "Vancouver");
	  Flight f3 = new Flight(3, 3, 700, "10am", "Washington DC", "Toronto");
	  Flight f4 = new Flight(4, 4, 600, "11am", "Ottawa", "New York");
	  Flight f5 = new Flight(5, 5, 500, "1130am", "Montreal", "Vancouver");
	  Flight f6= new Flight(6, 6, 400, "1130am", "Tornoto", "Ottawa");
	  flights.add(f1);
	  flights.add(f2);
	  flights.add(f3);
	  flights.add(f4);
	  flights.add(f5);
	  flights.add(f6);
  }
  
  /**
   * Method to display flights
   * if flight does not exist, prints 'no available flights'
   * else prints out all available flights with space
   * @param origin Origin of the flight you want
   * @param destination Destination of the flight you want
   */
  public void displayFlights(String origin, String destination){
	  boolean b = true;
	  for(int i =0; i<flights.size(); i++){
		  if(flights.get(i).getNumberOfSeatsLeft()!=0){
			  if((origin.equals(flights.get(i).getOrigin()))&&(destination.equals(flights.get(i).getDestination()))){
				  if(b){
					  System.out.print("Available Flights: ");
					  b= false;
				  }
		  System.out.println(flights.get(i));
		  System.out.println("");
			  }
		  }
		  
	  }
	  if(!b){
		  System.out.println("There are no available flights\n");
	  }
	  
	  
  }
  
  /**
   * getter method for flight
   * searches array of flights for desired flight
   * @param flightNumber flight number of the flight you want
   * @return flight if found, otherwise returns null
   */
  public Flight getFlight(int flightNumber){
	  
	  for(int i =0; i<flights.size(); i++){
		  if(flights.get(i).getFlightNumber()==flightNumber){
			  return flights.get(i);
		  }
		  
		  
	  }
	  return null;
	  
  }
  
  /**
   * method to book a seat
   * if the flight number exists and the flight is not full books a seat and adds a ticket object to the instance variable ticket array list
   * else prints the flight is booked
   * @param flightNumber flight number for desired flight to be booked
   * @param p Passenger object (polymorphic for type Member and NonMember) for who the ticket is being booked for
   */
  public void bookSeat(int flightNumber, Passenger p){
	  if(getFlight(flightNumber)!=null){
		  if(getFlight(flightNumber).bookASeat()){
			  Ticket t = new Ticket(p, getFlight(flightNumber), p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
			  System.out.println(t);
			  tickets.add(t);
		  }
		  else{
			  System.out.println("This Flight is fully booked.");
		  }
		  
	  }
	  else{
		  System.out.println("There is no flight with this Flight Number");
	  }
	  
  }
  
  /**
   * Main method
   * to prove functionality of this class as well as, Passenger, Member, NonMember, Ticket, and Flight
   */
  public static void main(String[] args){
	  Manager m = new Manager();
	  m.createFlights();
	 Member m1 = new Member(1, 1, "Member 1");
	 Member m2 = new Member(2, 2, "Member 2");
	 Member m3 = new Member(6, 6, "Member 3");
	 
	 NonMember n1 = new NonMember(24, "NonMember 1");
	 NonMember n2 = new NonMember(66, "NonMember 2");
	 m.displayFlights("a", "b");
	 m.displayFlights("Toronto", "Ottawa");
	 m.displayFlights("Montreal", "Vancouver");
	 m.displayFlights("Montreal", "Toronto");
	 
	 System.out.println("");
	 
	 Flight f = m.getFlight(1);
	 Flight f1 = m.getFlight(4);
	 Flight f2 = m.getFlight(6);
	 Flight f3 = m.getFlight(7);
	 
	 System.out.println(f);
	 System.out.println(f1);
	 System.out.println(f2);
	 System.out.println(f3);
	 
	 System.out.println("");
	 
	  m.bookSeat(10, m1);
	  
	  System.out.println("");
	  
	  m.bookSeat(1, m1);
	  m.bookSeat(1, m2);
	  
	  System.out.println("");
	  
	  m.bookSeat(2, m1);
	  m.bookSeat(2, m2);
	  m.bookSeat(2, m3);
	  
	  System.out.println("");
	  
	  m.bookSeat(3, m1);
	  m.bookSeat(3, m2);
	  m.bookSeat(3, m3);
	  m.bookSeat(3, n1);
	  
	  System.out.println("");
	  
	  m.bookSeat(4, m1);
	  m.bookSeat(4, m2);
	  m.bookSeat(4, m3);
	  m.bookSeat(4, n1);
	  m.bookSeat(4, n2);
	  
	  System.out.println("");
	  
	  m.bookSeat(5, m1);
	  m.bookSeat(5, m2);
	  m.bookSeat(5, m3);
	  m.bookSeat(5, n1);
	  m.bookSeat(5, n2);
	
  }

}
