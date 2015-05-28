package ba.bitcamp.edvin.For;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi broj 1: \n" + "Unesi broj 2:");
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
	
		
		for (int i = 2; i <= num1 && i <= num2;i++)
			if(num1 % i == 0 && num2 % i ==0){
				
				System.out.println("Zajednicki djelioc je: " + i);
				break;
			}
		
		
	
		
		in.close();
		}

}
