package ba.bitcamp.edvin.For;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int num= in.nextInt();
		boolean prost = true;
		
		for (int i=0; i <= num; i++){
			if (num % i == 0 && i != num){
				
			System.out.println("Broj nije prost");
			prost = false;
		}else  if (prost= true);
			System.out.println("Broj je prost");
		

	}

}
}