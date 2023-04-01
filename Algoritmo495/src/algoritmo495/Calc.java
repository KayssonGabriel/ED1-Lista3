package algoritmo495;

public class Calc {
	void ordena(String[] vetor) {
		String[] nome = new String[vetor.length];
		String[] sobrenome = new String[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			String[] partes = vetor[i].split(" ");
			nome[i] = partes[0];
			sobrenome[i] = partes[partes.length - 1];
		}
		
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (sobrenome[i].compareTo(sobrenome[j]) > 0 ||
						(sobrenome[i].compareTo(sobrenome[j]) == 0 && nome[i].compareTo(nome[j]) > 0)) {
					String tempNome = nome[i];
					String tempSobrenome = sobrenome[i];
					nome[i] = nome[j];
					sobrenome[i] = sobrenome[j];
					nome[j] = tempNome;
					sobrenome[j] = tempSobrenome;
				}
			}
		}
		
		for (String nomeCompleto : vetor) {
			System.out.println(nomeCompleto);
		}
	}
}
