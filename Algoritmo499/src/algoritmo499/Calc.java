package algoritmo499;

import java.util.Arrays;

public class Calc {
	boolean vazio;

	void ordena(Integer[] vetor) {
		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

	void imprimir(Integer[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

	void vazio(Integer[] vetor) {
		vazio = true;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				vazio = false;
				break;
			}
		}
	}

}
