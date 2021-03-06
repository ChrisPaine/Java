package mawr.college;

public class BetterExceptionExample {

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
			throw new IllegalArgumentException("str must contain a valid integer");
		}
		return "" + Math.pow(n, 2);
	}

}
