package mawr.college;

/**
 * Program to show interest on a sample account balance.  
 * @see E-mail Address: janeq@somemachine.etc.etc. 
 * @param Last Changed: September 21, 2001.
 * @author Jane Q. Programmer.
 */
public class ShowInterest {

	public static final double INTEREST_RATE = 2.5;

	public static void main(String[] args) {
		double balance = 100;
		double interest; // as a percent

		interest = balance * (INTEREST_RATE / 100.0);
		System.out.println("On a balance of $" + balance);
		System.out.println("you will earn interest of $" + interest);

		System.out.println("All in just one short year.");
	}

	/*
	 * Although it would not be as clear. it is legal to place the definition of
	 * INTEREST_RATE here instead.
	 */
}
