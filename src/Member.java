/**
 * 
 * @author Josh
 * Member object, a subclass of the Passenger object
 */
public class Member extends Passenger {

	int yearsOfMembership;
	/**
	 *  Constructor for a member object
	 * @param y the amount of years this passenger has been a member
	 * @param a the age of the passenger
	 * @param n the name of the passenger
	 */
	public Member(int y, int a, String n){
		super(a, n);
		yearsOfMembership = y;
	}
	
	/**
	 * Overwritten abstract method from passenger class
	 * @param p the original price of the flight
	 * @return the discounted price
	 */
	public double applyDiscount(double p){
		if(yearsOfMembership>5){
			p = p*0.5;
	    return p;
		}
		else if(yearsOfMembership>1 && yearsOfMembership<=5){
		p=p*0.9;
			return p;
		}
		else{
			return p;
		}
		
	}
}
