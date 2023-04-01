package algoritmo499;

import java.util.Scanner;

public class Algoritmo499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calc calc = new Calc();

		Integer[] vetor = new Integer[5];

		while (true) {
			System.out.println();
			System.out.println("  MENU VETOR - FUNCAO");
			System.out.println("\n  1 Dados do VETOR");
			System.out.println("  2 Ordena VETOR");
			System.out.println("  3 Imprime VETOR");
			System.out.println("  4 Sai do programa");
			System.out.print("\n  OPCAO: ");

			int opcao = sc.nextInt();
			if (opcao == 4) {
				break;
			} else if (opcao == 1) {
				for (int i = 0; i < vetor.length; i++) {
					System.out.print("Digite numero " + (i + 1) + ": ");
					vetor[i] = sc.nextInt();
					sc.nextLine();
				}
			} else if (opcao == 2) {
				if (calc.vazio == true) {
					System.out.println("Escolha primeiro opcao 1");
				} else {
					Calc calc1 = new Calc();
					calc1.ordena(vetor);
				}
			} else if (opcao == 3) {
				if (calc.vazio == true) {
					System.out.println("Escolha primeiro opcao 1");
				} else {
					Calc calc1 = new Calc();
					calc1.imprimir(vetor);
				}
			} else {
				System.out.println("Opcao invalida ");
			}

		}

		sc.close();

	}

}
