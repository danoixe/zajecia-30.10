import java.util.Scanner;

public class Zadanie_2_10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹");
		int a = reader.nextInt();
		int i = 1;
		double j = 0;
		double k = 0;
		int d=0;
		int p=0;
		int n=0;
		
		while (i<a) {
			int b = a/i;
			int c = b%10;
			i = i*10;
			d=d+c;
			
			if (c%2==0) {
				p=p+c;
				j++;
			}
			else {
				n=n+c;
				k++;
			}
			
		}

		double s = (p/j)/(n/k);
		
		System.out.println("Suma cyfr wynosi: "+d);
		System.out.println("Stosunek œredniej parzystych do œredniej nieparzystych wynosi "+s);
	}

}
