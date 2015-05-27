package ba.bitcamop.edvin.vjezbe;

public class Palindrom {

	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			int rev = 0;
			int num = i;
			while (num != 0) {
				rev = rev * 10 + (num % 10);
				num/=10;
			}
			if (i==rev){
				System.out.println(i);
			}
		}
	}

}
