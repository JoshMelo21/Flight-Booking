/**
 * 
 * @author Josh
 *NonMember Object subclass of Passenger
 */
public class NonMember extends Passenger {

	/**
	 * Constructor for a NonMember object
	 * @param age age of the passenger
	 * @param name name of the passenger
	 */
	public NonMember(int age, String name){
		super(age, name);
	}
	/**
	 * Overwritten abstract method from passenger class
	 * @param p the original price of the flight
	 * @return the discounted price
	 */
	public double applyDiscount(double p){
		
		if(age>65){
			return p=p*0.9;
		}
		return p;
		
		
	}
	
}
