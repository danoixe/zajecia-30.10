import java.util.Scanner;

public class Zadanie_2_7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj znak wypelnienia");
		String z = reader.next();
		System.out.println("Podaj wspó³rzêdne lewego górnego rogu prostokata");
		int x = reader.nextInt();
		int y = reader.nextInt();
		System.out.println("Podaj d³ugoœci boków");
		int a = reader.nextInt();
		int b = reader.nextInt();
		
		int i;
		int j;
		
		for (i=2; i<=y; i++) {
			System.out.println();
		}
		for (i=0; i<b; i++) {
			for (j=2; j<=x; j++) {
				System.out.print(" ");
			}
			for (j=0; j<a; j++) {
				System.out.print(z);
			}
			System.out.println();
		}
		
	
}

}
