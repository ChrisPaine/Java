package mawr.college;

public class LoopExamples {

	public static void main(String[] args) {
		// Example break in a for Loop
		//int i;
		for (int i = 1; i < 10; i = i + 1) {
			if (i == 5) {
				break;
			}
			System.out.print(i);
		}
		System.out.println(" ");
		
		// Example continue in a for Loop
		//int i;
		for (int i = 1; i < 10; i = i + 1) {
			if (i == 5) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println(" ");
		
		i = 1;
		while (i < 10){
			if(i == 5){
				continue;
			}
			System.out.print(i);
			i = i +1;
		}
		System.out.println("Done");
	}
}
