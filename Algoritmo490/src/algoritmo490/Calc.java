package algoritmo490;

class Calc {

	void restantes(String[] vet) {
		for (int i = 0; i < vet.length; i++) {
			String novaString = vet[i].replace("c", "*");
			System.out.println((i + 1) + " - " + novaString);
		}
	}
}
