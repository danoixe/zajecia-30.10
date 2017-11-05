import java.util.Scanner;

public class Zadanie_2_12 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Podaj kwotê reszty: ");
		int a = r.nextInt();
		int b = r.nextInt();
		int i=0;
		int x = 0;
		
		// z³otówki
		while (x<=a-5) {
			x = x + 5;
			i++;
		}
		System.out.println(i+" x "+5+"z³");
		i = 0;
		
		while (x<=a-2) {
			x = x + 2;
			i++;	
		}
		System.out.println(i+" x "+2+"z³");
		i=0;
		
		while (x<=a-1) {
			x = x + 1;
			i++;	
		}
		System.out.println(i+" x "+1+"z³");
		i=0;
		x=0;
		
		// grosze
		while (x<=b-50) {
			x = x + 50;
			i++;	
		}
		System.out.println(i+" x "+50+"gr");
		i=0;
		
		while (x<=b-20) {
			x = x + 20;
			i++;	
		}
		System.out.println(i+" x "+20+"gr");
		i=0;
		
		while (x<=b-10) {
			x = x + 10;
			i++;	
		}
		System.out.println(i+" x "+10+"gr");
		i=0;
		
		while (x<=b-5) {
			x = x + 5;
			i++;	
		}
		System.out.println(i+" x "+5+"gr");
		i=0;
		
		while (x<=b-2) {
			x = x + 2;
			i++;	
		}
		System.out.println(i+" x "+2+"gr");
		i=0;
		
		while (x<=b-1) {
			x = x + 1;
			i++;	
		}
		System.out.println(i+" x "+1+"gr");
	}

}
