package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o numero: ");
		int num = sc.nextInt();
		Calc calc = new Calc(num);
		
		int x = calc.reverso(num);
		System.out.println(calc.getNum()+" - "+x);
		
		if (x == calc.getNum()) {
			System.out.println("É um número capicua");
		}else {
			System.out.println("Não é um número capicua");
		}
		
		sc.close();


	}

}
