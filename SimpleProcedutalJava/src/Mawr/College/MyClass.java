package Mawr.College;

public class MyClass {
	static boolean sawNonZero = false;

	public static void main(String[] args) {
		System.out.print("Hello, World");
		
		int quotient = 3 / 4;
		if (testNonZero(quotient)){
			System.out.println("\nQuotient is non-zero \n");
		}
	}
	
	static boolean testNonZero(int value){
		if (value != 0){
			sawNonZero = true;
		return true;
		} else
			return false;
	}

}
