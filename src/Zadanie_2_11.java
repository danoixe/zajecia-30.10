import java.util.Scanner;

public class Zadanie_2_11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹ dodatni¹");
		int a = reader.nextInt();
		int b=a;
		int c=a-1;
		
		int i;
		int j;
		int k;
		
		for (i=0; i<a; i++) {
			for (j=b-1; j>0; j--) {
				System.out.print(" ");
			}
			for (k=0; k<a-c; k++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
			c=c-2;
		}
	}

}
