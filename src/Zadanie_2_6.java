import java.util.Random;
import java.util.Scanner;

public class Zadanie_2_6 {

	public static void main(String[] args) {
		Random los = new Random();
		Scanner reader = new Scanner(System.in);
		int a = los.nextInt(100)+1;
		System.out.println("Gra w 'Za du�o, za ma�o'");
		System.out.println("Podaj liczb� od 1 do 100");
		int b = reader.nextInt();
		while (b!=a) {
			if (b<a) {
				System.out.println("Poda�e� za ma�� warto��");
			}
			else if (b>a) {
				System.out.println("Poda�e� za du�� warto��");
			}
			b = reader.nextInt();
		}
			System.out.println("Gratulacje!");
		
	}

}
