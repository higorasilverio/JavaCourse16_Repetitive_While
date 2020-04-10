package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Read the coordinates X and Y until one is zero ***");
		System.out.println();
		
		boolean out = false;
		while(out == false) {
			System.out.print("Enter the X coordinate: ");
			double x = scanner.nextDouble();
			System.out.print("Enter the Y coordinate: ");
			double y = scanner.nextDouble();
			if (x > 0 && y > 0)	System.out.println("First!");
			else if (x < 0 && y > 0) System.out.println("Second!");
			else if (x < 0 && y < 0) System.out.println("Third!");
			else if (x > 0 && y < 0) System.out.println("Fourth!");
			else if (x == 0 || y == 0) out = true;
			System.out.println();
		}
		
		scanner.close();		
	}

}
