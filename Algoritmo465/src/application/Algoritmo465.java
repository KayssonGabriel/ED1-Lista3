package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número 1: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o número 2: ");
		int num2 = sc.nextInt();
		Calc calc = new Calc(num1, num2);
		
		calc.verifica(num1, num2);
		
		sc.close();

	}

}
