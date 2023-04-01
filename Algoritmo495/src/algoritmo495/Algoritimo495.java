package algoritmo495;

import java.util.Scanner;

public class Algoritimo495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de elementos: ");
		int tamanho = sc.nextInt();

		String[] vetor = new String[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o nome " + (i + 1) + ": ");
			vetor[i] = sc.nextLine();
			sc.next();
		}
		
		Calc calc = new Calc();
		calc.ordena(vetor);

		sc.close();

	}

}
