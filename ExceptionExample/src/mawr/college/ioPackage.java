package mawr.college;

import java.io.*;

public class ioPackage {

	public static void main(String[] args) {
		// Example: reading lines from the console

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = null;

		try {
			name = console.readLine();
		} catch (IOException e) {
			System.err.println("Fatal input error: " + e);
			System.exit(1);
		}
		System.out.println("Hello " + name);

	}

}
