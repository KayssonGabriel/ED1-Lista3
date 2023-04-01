package algoritmo483;

public class Calc {
	int produtoInterno(int[] vetor1, int[] vetor2, int quant) {
		int produto = 0;
		for (int i = 0; i < quant; i++) {
			produto += vetor1[i] * vetor2[i];
		}
		return produto;
	}

}
