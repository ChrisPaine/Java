package mawr.college;

public class Date1Demo {

	public static void main(String[] args) {
		// Create a Date1 object.
		Date1 myDate;
		myDate = new Date1();

		// Give Values to data members.
		myDate.month = "July";
		myDate.day = 4;
		myDate.year = 2007;

		// invoke toString method.
		output(myDate);
		
		myDate.month = "January";
		myDate.day = 5;
		myDate.year = 2015;
		output(myDate);
	}
	public static void output(Date1 myDate){
		String dateString = myDate.toString();
		System.out.println(dateString);
	}
}
