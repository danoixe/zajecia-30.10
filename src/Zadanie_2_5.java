import java.util.Scanner;

public class Zadanie_2_5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj liczby, które chcesz zsumowaæ, jako ostatnie podaj¹c 0.");
		System.out.println("Podaj liczbê ca³kowit¹ dodatni¹:");
		int b = reader.nextInt();
		
		int a = 1;
		int x = b;
		int y = b;
		int z = 0;
		int i = 0;
		while (a!=0) {
			System.out.println("Podaj kolejn¹ liczbê ca³kowit¹ dodatni¹:");
			a = reader.nextInt();
			if (a>x) {
				x = a;
			}
			else if (a<y) {
				y = a;
			}
			z = z+a;
			i++;
			
		}
		z=z+b;
		double s=(z/i);
		System.out.println("Najmniejsze jest "+y);
		System.out.println("Najwiêksze jest "+x);
		System.out.println("Suma to "+z);
		System.out.println("Œrednia to "+z/i);
		

	}

}
