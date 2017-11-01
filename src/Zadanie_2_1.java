import java.util.Scanner;

public class Zadanie_2_1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("LICZBY NIEPARZYSTE MNIEJSZE OD PODANEJ");
		System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
		int a = reader.nextInt();
		int x=1;
		int i=0;
		while (x<=a) {
			
			i++;
			System.out.println(x);
			x=2*i+1;
		}

	}

}
