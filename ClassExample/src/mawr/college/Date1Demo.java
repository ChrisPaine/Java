package mawr.college;

public class Date1Demo {

	public static void main(String[] args) {
		//Sample Code Segment Using Datel 
		Date1 newYears =new Date1(); 
		newYears.month = "January"; 
		newYears.day = 1; 
		newYears.year = 2011; 
		
		Date1 birthday = new Date1(); 
		birthday.month = "July"; 
		birthday.day =4;
		birthday.year =1776; 
		
		System.out.println(newYears.toString()); 
		System.out.println(birthday.toString()); 
		System.out.println(birthday.monthString(6));

		birthday.setDate(2, 2, 2002); 
		System.out.println(birthday.toString());
		newYears.day = 42; 
		System.out.println(newYears.toString());
		
		
	}
}
