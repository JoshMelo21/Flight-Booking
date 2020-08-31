/**
 * 
 * @author Joshua Melo
 * Abstract Passenger Object Class
 *
 * 
 */
public abstract class Passenger {

	String name ;
	int age;
	/**
	 * Constructor for passenger
	 * @param age is the age of the passenger
	 * @param name is the name of the passenger as a string
	 */
	public Passenger(int age, String name){
		this.age = age;
		this.name = name;	
	}
	
	/**
	 * Setter method for age
	 * @param a sets the passenger age
	 */
	public void setAge(int a){
		age = a;
	}
	/**
	 * Setter method for name
	 * @param a sets the passenger name
	 */
	public void setName(String a){
		name = a;
	}
	
	/**
	 * getter method for age
	 * @return returns the current value for age
	 */
	public int getAge(){
		return age;
	}
	/**
	 * getter method for name
	 * @return the current value for name
	 */
	public String getName(){
	return name;
}
	/**
	 * A method to be implemented in subclasses which applies a discount based on age or years being a member
	 * @param p the original price of the flight
	 * @return the new discounted price
	 */
	public abstract double applyDiscount(double p);
	
	
}
