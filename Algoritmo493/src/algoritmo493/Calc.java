package algoritmo493;

public class Calc {

	public static int busca(int[] vetor) {
	    for (int i = 0; i < vetor.length - 1; i++) {
	        if (vetor[i] > vetor[i + 1]) {
	            return 0;
	        }
	    }
	    return 1;
	}

	public static int busca1(int[] vetor) {
	    for (int i = 0; i < vetor.length - 1; i++) {
	        if (vetor[i] < vetor[i + 1]) {
	            return 0;
	        }
	    }
	    return 1;
	}

	void verificaOrdem(int[] vetor) {
		int r = busca(vetor);
		int r1 = busca1(vetor);
		if (r == 1) {
			System.out.println("ORDENAÇãO CRESCENTE ");
		} else if (r1 == 1) {
			System.out.println("ORDENAÇÃO DECRESCENTE");
		} else{
			System.out.println("NAO ESTA ORDENADO");
		}
	}

}
