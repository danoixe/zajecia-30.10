import java.util.Scanner;

public class Zadanie_2_2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("SUMA CI�GU ARYTMETYCZNEGO");
		System.out.println("Podaj mniejsz� liczb�");
		int a = reader.nextInt();
		System.out.println("Podaj wi�ksz� liczb�");
		int b = reader.nextInt();
		int c=a;
		
		// pierwsza p�tla
		int i=c;
		while (i<b) {
			a=a+i+1;
			i++;
		}
		System.out.println(a);
		
		// druga p�tla
		i=c;
		a=c;
		do {
			a=a+i+1;
			i++;
		} while(i<b);
			System.out.println(a);
		
		// trzecia p�tla
		i=c;
		a=c;
		for(i=c; i<b; i++) {
			a=a+i+1;
		}
		System.out.println(a);

	}

}
