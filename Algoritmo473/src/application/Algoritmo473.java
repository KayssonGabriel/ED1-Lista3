package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo473 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a letra: ");
		char letra = sc.next().charAt(0);
		char letraMaiuscula = Character.toUpperCase(letra);
		
		Calc calc = new Calc(letraMaiuscula);

		if (calc.verifica(letraMaiuscula) == 0) {
			System.out.println("não é uma consoante");
		}else {
			System.out.println("é uma consoante");
		}
		
		sc.close();

	}

}
