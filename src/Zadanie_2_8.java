import java.util.Scanner;

public class Zadanie_2_8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj liczb� ca�kowit�");
		int a = reader.nextInt();
		int i;
		System.out.println("Dzielniki podanej liczby to: ");
		for (i=1; i<=a; i++) {
			if (a%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
