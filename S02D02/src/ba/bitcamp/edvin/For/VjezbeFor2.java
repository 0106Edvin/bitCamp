package ba.bitcamp.edvin.For;
import java.util.Scanner;
public class VjezbeFor2 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int input = 0;
	
	do {
		System.out.println("Unesi broj: ");
		input = in.nextInt ();
		System.out.println("Taj broj: "+ input);
	}while (input != 0);
	
	
	
	}

}
