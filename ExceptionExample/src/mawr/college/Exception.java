package mawr.college;

public class Exception {

	public static void main(String[] args) {
		String result = squareNumberString("12");
		System.out.println(result);
		String results = squareNumberString("ab");
	}

	// Exception Example
	static String squareNumberString(String str) {
		int n = 0;
		try {
			n = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.err.println("Error: invalid integer \"" + str + "\"");
			System.exit(1);
		}
		return "" + Math.pow(n, 2);
	}

}
