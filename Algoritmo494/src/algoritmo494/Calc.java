package algoritmo494;

public class Calc {
	public void ordenar(String[] nome, String[] ender, String[] prof) {
		for (int i = 0; i < nome.length - 1; i++) {
			for (int j = i + 1; j < nome.length; j++) {
				if (nome[i].compareToIgnoreCase(nome[j]) > 0) {
					troca(nome, i, j);
					troca(ender, i, j);
					troca(prof, i, j);
				}
			}
		}
	}

	public void troca(String[] vetor, int i, int j) {
		String temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}

}
