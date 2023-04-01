package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double l = 0;
		double b = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("digite logaritmando:");
			l = sc.nextDouble();
			System.out.println();

			System.out.print("digite base:");
			b = sc.nextDouble();
			System.out.println();
			Calc calc = new Calc(l, b);
			
			System.out.println("logaritmo: " + calc.log(l, b));
		}
		sc.close();
	}
}
