package mwr.college;

public class switchExample {

	public static void main(String[] args) {
		// switch Example
		int day = 0;

		switch (day) {
		case 1:
			System.out.println("Monday\n");
			break;
		case 2:
			System.out.println("Tuesday\n");
			break;
		case 3:
			System.out.println("Wednesday\n");
			break;
		case 4:
			System.out.println("Thursday\n");
			break;
		case 5:
			System.out.println("Friday\n");
			break;
		case 0: // no break fall through to 6...
		case 6:
			System.out.println("Weekend\n");
			break;
		default:
			System.out.println("Error � invalid day\n");
			break;

		}
	}
}