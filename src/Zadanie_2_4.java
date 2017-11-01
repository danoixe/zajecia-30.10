import java.util.Scanner;

public class Zadanie_2_4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("SUMA LICZB DO PODANIA 0");
		System.out.println("Podaj liczby, które chcesz zsumowaæ, jako ostatnie podaj¹c 0.");
		int a = 1;
		int x = 0;
		while (a!=0) {
			System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
			a = reader.nextInt();
			x=x+a;
		}
		
		System.out.println(x);

	}

}
