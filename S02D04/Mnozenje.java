import java.util.Scanner;

public class Mnozenje {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bodovi = 0;

		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 9 + 1);
			int b = (int) (Math.random() * 9 + 1);

			System.out.print
			(a + " * " + b + " = ");
			int input = in.nextInt();
			if (input == a * b) {
				bodovi++;
			} else
				bodovi--;

		}
		if (bodovi > 3);
		{
		}
		for (int i = 1; i <= 5; i++) {

			int a = (int) (Math.random() * 10 + 10);
			int b = (int) (Math.random() * 9 + 1);
			System.out.print(a + " * " + b + " = ");
			int input = in.nextInt();
			if (input == a * b) {
				bodovi++;
			} else
				bodovi--;
			TextIO.writeFile("results.txt");
		}
		System.out.println("Points: " + bodovi);
		
	}

}
