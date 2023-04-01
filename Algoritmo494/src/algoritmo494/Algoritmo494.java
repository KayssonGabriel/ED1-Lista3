package algoritmo494;

import java.util.Scanner;

public class Algoritmo494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nome = new String[3];
		String[] ender = new String[3];
		String[] prof = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Digite endereco: ");
			ender[i] = sc.nextLine();
			System.out.print("Digite profissao: ");
			prof[i] = sc.nextLine();
		}

		Calc calc = new Calc();
		calc.ordenar(nome, ender, prof);

		for (int i = 0; i < 3; i++) {
			System.out.println(nome[i] + " " + ender[i] + " " + prof[i]);
		}

		sc.close();
	}
}