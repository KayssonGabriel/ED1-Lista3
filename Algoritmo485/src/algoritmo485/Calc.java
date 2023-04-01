package algoritmo485;

public class Calc {
	void multivetor(int[] vetorNum, char[] vetorCaractere, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println();
            for (int j = 0; j < vetorNum[i]; j++) {
                System.out.print(vetorCaractere[i]);
            }
        }
    }
}
