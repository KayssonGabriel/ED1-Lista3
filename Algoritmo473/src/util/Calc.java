package util;

public class Calc {
	private char letra;

	public Calc(char letra) {
		super();
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int verifica(char letra) {
		if (letra == 'A') {
			return 0;
		}else if(letra == 'E') {
			return 0;
		}else if(letra == 'I') {
			return 0;
		}else if(letra == 'O') {
			return 0;
		}else if(letra == 'U') {
			return 0;
		}else {
			return 1;
		}
	}
}