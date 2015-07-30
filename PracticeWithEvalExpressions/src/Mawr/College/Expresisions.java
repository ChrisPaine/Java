package Mawr.College;

public class Expresisions {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 0;
		
		
		int result = a + b - c + d;
		int result2 = a * b / c;
		int result3 = 1 + a * b % c;
		int result4 = a + d % b - c;
		int result5 = e = b = d + c / b - a;
		
		
		System.out.println("a + b - c + d \t\t= " + result);
		System.out.println("a * b / c \t\t= " + result2);
		System.out.println("1 + a * b % c \t\t= " + result3);
		System.out.println("a + d % b - c \t\t= " + result4);
		System.out.println("e = b = d + c / b - a \t= " + result5);
	}

}
