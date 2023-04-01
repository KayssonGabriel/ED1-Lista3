package algoritmo487;

import java.util.Scanner;

public class Algoritmo487 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite a quantidade de elementos");
		int tamanho = sc.nextInt();

		int[] vetorNum = new int[tamanho];

		for (int i = 0; i < vetorNum.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ": ");
			vetorNum[i] = sc.nextInt();
		}

		Calc calc = new Calc();

		calc.inverte(vetorNum, tamanho);

		System.out.println("VETOR");
		for (int i = 0; i < vetorNum.length; i++) {
			System.out.println((i + 1) + " - " + vetorNum[i]);
		}

		sc.close();

	}

}
