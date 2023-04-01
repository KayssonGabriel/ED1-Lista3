package algoritmo497;

import java.util.Scanner;

public class Algoritmo497 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");
		int tamanho = sc.nextInt();

		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite numero " + (i + 1) + ": ");
			vetor[i] = sc.nextInt();
			sc.nextLine();

		}

		System.out.println("Digite numero de busca:");
		int num = sc.nextInt();

		Calc calc = new Calc();
		calc.verifica(vetor, num);

		sc.close();

	}
}
