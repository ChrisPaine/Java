package mar.college;

public class ArrayAsParameters {

	public static void main(String[] args) {
		double[] a = new double[10];
		double[] b = new double[30];
		
		doubleElements(a);
		System.out.println(" ");
		doubleElements(b);
	}
	
	public static void doubleElements(double[] a) //a = address
	{ 
		for (int i = 0; i < a.length; i++){  //notice use of a.length
		a[i] = a[i] + i *2;
		System.out.println(a[i]);
		}
	}
}
