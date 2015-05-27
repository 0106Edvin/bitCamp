package ba.bitcamp.edvin.For;

import java.util.Scanner;

public class VjezbeFor3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input = 0;
		int counter = 0;
		int counter2 = 0;
		do {
			System.out.println("Unesi broj");
			input = in.nextInt();
			if (input % 2 == 0 && input!=0){
			counter++;
			} else if ( input % 2 != 0 ){
			counter2 ++;
			
		} 
				
			}
		while (input != 0);{
		System.out.println("Uneseno je: "+ counter + " parnih brojeva i " + counter2 + " neparnih brojeva");
		
			
		}
	}
}

		
		
		

