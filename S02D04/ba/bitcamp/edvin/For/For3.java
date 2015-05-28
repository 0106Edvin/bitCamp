package ba.bitcamp.edvin.For;
import java.util.Scanner;
public class For3 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int num= in.nextInt();
		boolean prost = true;
		
		for (int i=2; i < num; i++){
			if (num % i == 0){
				
			System.out.println("Broj nije prost");
			prost = false;
			break;
			} prost= true;
			System.out.println("Broj je prost");
		break;

	}

}
}