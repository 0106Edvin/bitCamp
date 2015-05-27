package ba.bitcamop.edvin.vjezbe;

public class Task3 {

	public static void main(String[] args) {

		for (int i = 101; i < 1000; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					
				}
			}
			if (isPrime = true) {
				System.out.println(i);
			}

		}

	}
}
