package algoritmo483;

import java.util.Scanner;

public class Algoritmo483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite a quantidade de elementos");
		int quantidade = sc.nextInt();

		int[] vetor1 = new int[quantidade];
		int[] vetor2 = new int[quantidade];

		System.out.println("vetor1");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = sc.nextInt();
		}

		System.out.println("vetor2");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = sc.nextInt();
		}

		Calc calc = new Calc();

		System.out.println("VETOR A \t VETOR B");

		for (int i = 0; i < quantidade; i++) {
			System.out.println(vetor1[i] + "\t" + vetor2[i]);
		}
		System.out.println("produto interno: " + calc.produtoInterno(vetor1, vetor2, quantidade));

		sc.close();

	}

}
