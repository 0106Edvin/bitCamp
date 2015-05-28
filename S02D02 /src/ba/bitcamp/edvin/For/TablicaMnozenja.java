package ba.bitcamp.edvin.For;

public class TablicaMnozenja {

	public static void main(String[] args) {
		int m = 9;
		int n = 9;
		
		for ( int i = 1; i <= m; i++){
			for (int j = 1; j <= n; j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}

	}

}
