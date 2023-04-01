package algoritmo460;

import java.util.Scanner;

public class Algoritmo460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calc calculadora = new Calc();

		for (int c = 1; c <= 3; c++) {
			System.out.println("Digite número: ");
			int a = sc.nextInt();

			System.out.println("dobro: " + calculadora.dob(a));

		}
		sc.close();
	}

}
