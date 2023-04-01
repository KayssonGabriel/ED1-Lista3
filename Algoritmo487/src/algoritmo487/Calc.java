package algoritmo487;

public class Calc {

	void inverte(int[] vetorNum, int max) {
		int k = max;

		for (int i = 0; i < max / 2; i++) {
			int aux = vetorNum[i];
			k--;
			vetorNum[i] = vetorNum[k];
			vetorNum[k] = aux;
		}
	}
}
