package ba.bitcamp.edvin.For;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi dva broja :");
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print("*");
			}
		
		System.out.println();
		}
	}

}
