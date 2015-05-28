package ba.bitcamp.edvin.For;
import java.util.Scanner;
public class For1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi broj : ");
		int num = in.nextInt();
		int factorial = 1;
		for (int i = num ; i >0; i-- )
			factorial*=i;
			System.out.println(factorial);
		
		in.close();
}
}	
