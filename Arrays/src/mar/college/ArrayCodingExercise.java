package mar.college;

public class ArrayCodingExercise {

	public static void main(String[] args) {
		int[] foo  = {2,2,3,1,5,10,9};
		int result = foo[0];
		int atIndex = 0;
		
		for(int index = 0; index == foo.length; index++){
			System.out.println(foo[index]);
			if(result > foo[index]){
				result = foo[index];
				atIndex = index;
			}
			System.out.println("index = " + atIndex);
			System.out.println("result = " + result);
		}


	}

}
