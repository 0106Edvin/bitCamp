package ba.bitcamop.edvin.vjezbe;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;
		double ave = 0;
		int sum = 0;
		int num = 0;
		do {
			System.out.print("Unesi broj: ");
			num = in.nextInt();
			if (num != -1){
				counter++; 
			sum += num;}

		}while (num != -1);
		ave= sum / counter;

		System.out.println(ave);
	}
}
