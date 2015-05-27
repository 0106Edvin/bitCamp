package ba.bitcamp.edvin.For;

public class Palindrom {

	public static void main(String[] args) {
		int num = 121;
		int rev = 0;
		int num1 = num;
		while (num > 0) {
			int digit = num % 10;
			num /= 10;
			rev = rev * 10 + digit;

		}
		if (rev == num1) {

			System.out.println("Broj je palindrom");
		} else
			System.out.println("Broj nije palindrom");
	}

}
