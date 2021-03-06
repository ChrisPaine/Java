package mawr.college;

public class Date1 {
	public String month;
	public int day;
	public int year;

	// change the month (using an int) , day, and year .
	public void setDate(int newMonth, int newDay, int newYear) {
		this.month = monthString(newMonth);
		this.day = newDay;
		this.year = newYear;
	}

	// change month number (int) to string � used by setDate
	public String monthString(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "????";
		}
	}

	public String toString() {
		// method definition and its implementation.
		return this.month + " " + this.day + ", " + this.year;
	}
}
