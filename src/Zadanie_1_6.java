import java.util.Scanner;

public class Zadanie_1_6 {

	public static void main(String[] args) {
		System.out.println("KALKULATOR");
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb�");
		double a = reader.nextDouble();
		System.out.println("Podaj znak dzia�ania:");
		String x = reader.next();
		System.out.println("Podaj drug� liczb�");
		double b = reader.nextDouble();
		switch (x) {
		case "+": System.out.println(a+b); break;
		case "-": System.out.println(a-b); break;
		case "*": System.out.println(a*b); break;
		case "/": System.out.println(a/b); break;
		default: System.out.println("B��dny znak dzia�ania.");
		}
	}

}
