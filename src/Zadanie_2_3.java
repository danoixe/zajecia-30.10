import java.util.Scanner;

public class Zadanie_2_3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("POT�GI LICZBY 2 MNIEJSZE OD PODANEJ LICZBY");
		System.out.println("Podaj liczb� ca�kowit� dodatni�");
		int a = reader.nextInt();
		int i;
		int x=1;
		while (x<a) {
		
			System.out.println(x);
			x=x*2;
		}
		
	}

}
