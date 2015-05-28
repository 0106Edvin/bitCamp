public class UcitavanjeTexta {

	public static void main(String[] args) {
		TextIO.readFile("src/text");
		
		int a = TextIO.getInt();
		int n = a;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += TextIO.getInt();
			
		}
		System.out.println(sum);

	}

}
