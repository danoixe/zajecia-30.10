import java.util.Scanner;

public class Zadanie_1_6 {

	public static void main(String[] args) {
		System.out.println("KALKULATOR");
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê");
		double a = reader.nextDouble();
		System.out.println("Podaj znak dzia³ania:");
		String x = reader.next();
		System.out.println("Podaj drug¹ liczbê");
		double b = reader.nextDouble();
		switch (x) {
		case "+": System.out.println(a+b); break;
		case "-": System.out.println(a-b); break;
		case "*": System.out.println(a*b); break;
		case "/": System.out.println(a/b); break;
		default: System.out.println("B³êdny znak dzia³ania.");
		}
	}

}
