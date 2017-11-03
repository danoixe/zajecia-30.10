import java.util.Scanner;

public class Zadanie_2_9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹ wiêksz¹ od 1");
		int a = reader.nextInt();
		int i;
		int j=0;
		if (a>1) {
		
		for (i=1; i<=a; i++) {
			if (a%i==0) {
				j++;
			}
		}
		if (j==2) {
			System.out.println("Podana liczba jest liczb¹ pierwsz¹");
		}
		else {
			System.out.println("Podana liczba nie jest liczb¹ pierwsz¹");
		}
		}
		else {
			System.out.println("B³êdna wartoœæ. Podana liczba jest nie wiêksza od 1.");
		}
		

	}

}
