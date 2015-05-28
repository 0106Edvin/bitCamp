package ba.bitcamp.edvin.For;

public class VjezbeFor1 {

	public static void main(String[] args) {
		
		int counter = 0;
		int pomocna = 0;
		int num = 12345;
		int sum = 0;
		int num2=num;
		
		while(num2>0){
			num2/=10;
			counter++;
		}
		for(int i=0; i<=counter; i++){
			pomocna=num%10;
			sum+=pomocna;
			num/=10;
		}
		
			System.out.println(sum);

	}
}
