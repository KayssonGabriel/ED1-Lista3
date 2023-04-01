package algoritmo485;

import java.util.Scanner;

public class Algoritmo485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite a quantidade de elementos");
		int tamanho = sc.nextInt();

		int[] vetorNum = new int[tamanho];
		char[] vetorCaractere = new char[tamanho];

		for (int i = 0; i < vetorNum.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ": ");
			vetorNum[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorCaractere.length; i++) {
			System.out.println("Digite o caractere " + (i + 1) + ": ");
			//sc.next();
			vetorCaractere[i] = sc.next().charAt(0);
		}

		System.out.println();

		Calc calc = new Calc();

		calc.multivetor(vetorNum, vetorCaractere, tamanho);

		sc.close();

	}

}
