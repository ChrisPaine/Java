package mar.college;

public class ArrayTestForValueEquality {

	public static void main(String[] args) {

	}
	
	// Code to Test for Value Equality
	public boolean equalsArray(int[] a, int[] b) {
		if (a.length == b.length) {
			int i = 0;
			boolean elementsMatch = true;
			while (i < a.length && elementsMatch) {
				if (a[i] != b[i])
					elementsMatch = false;
				i++;
			}
			return elementsMatch;
		} else
			return false;
	}
}