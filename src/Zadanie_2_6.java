import java.util.Random;
import java.util.Scanner;

public class Zadanie_2_6 {

	public static void main(String[] args) {
		Random los = new Random();
		Scanner reader = new Scanner(System.in);
		int a = los.nextInt(100)+1;
		System.out.println("Gra w 'Za du¿o, za ma³o'");
		System.out.println("Podaj liczbê od 1 do 100");
		int b = reader.nextInt();
		while (b!=a) {
			if (b<a) {
				System.out.println("Poda³eœ za ma³¹ wartoœæ");
			}
			else if (b>a) {
				System.out.println("Poda³eœ za du¿¹ wartoœæ");
			}
			b = reader.nextInt();
		}
			System.out.println("Gratulacje!");
		
	}

}
