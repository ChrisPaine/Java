package mawr.college;

public class Date1Demo2 {

	public static void main(String[] args) {
		//Date2Demo Class 
		Date2 myDate =	new Date2();
		myDate.setDate( 1, 23, 1982 ); 
		System.out.println( myDate.toString());
		myDate.setDate( 4, 1999 ); 
		System.out.println( myDate.toString()); 
	}
}
