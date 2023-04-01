package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite um número >0: ");
		int num = sc.nextInt();

		if (num > 0) {

			Calc calc = new Calc(num);

			if (calc.primo(num) == true) {
				System.out.println("é primo " + calc.getNum());
			} else {
				System.out.println("não é primo " + calc.getNum());
			}
		}else {
			System.out.println("erro");
		}

		sc.close();

	}

}
