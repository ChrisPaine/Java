package Mawr.college;

public class HandTraceExample {

	public static void main(String[] args) {
		int answer = 0, value = 4;
		
		System.out.println("Code:" + "\t\t\t" + "Value:" + "\t\t" + "Answer:");
		
		System.out.println("" + "\t\t\t" + value + "\t\t" + answer);
		
		value = value + 1;
		System.out.println("value = value + 1" + "\t" + value + "\t\t" + answer);
		
		value++;
		System.out.println("value++" + "\t\t\t" + value + "\t\t" + answer);
		
		++value;
		System.out.println("++value" + "\t\t\t" + value + "\t\t" + answer);
		
		answer = 2 * value++;
		System.out.println("answer = 2 * value++" + "\t" + value + "\t\t" + answer);
		
		answer = ++value / 2;
		System.out.println("answer = ++value / 2" + "\t" + value + "\t\t" + answer);
		
		value--;
		System.out.println("value--" + "\t\t\t" + value + "\t\t" + answer);
		
		--value;
		System.out.println("--value" + "\t\t\t" + value + "\t\t" + answer);
		
		answer = --value * 2;
		System.out.println("answer = --value * 2" + "\t" + value + "\t\t" + answer);
		
		answer = value-- / 3;
		System.out.println("answer = value-- / 3" + "\t" + value + "\t\t" + answer);
		
		int a = 1, b = 2, c = 3, d = 4;
		System.out.println("\n"+a +", "+ b+", "+ c+", "+ d) ;
		int result = ++b / c + a * d++;
		System.out.println("++b / c + a * d++ = " + result);
		System.out.println(a +", "+ b+", "+ c+", "+ d) ;
	}
}
