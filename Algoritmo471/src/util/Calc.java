package util;

public class Calc {
	private double divisor;
	private double dividendo;

	public Calc(double divisor, double dividendo) {
		super();
		this.divisor = divisor;
		this.dividendo = dividendo;
	}

	public double getDivisor() {
		return divisor;
	}

	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}

	public double getDividendo() {
		return dividendo;
	}

	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}

	public int divisor(double dividendo, double divisor) {
		int vezes = 0;
		while (dividendo % divisor == 0) {
			vezes++;
			dividendo /= divisor;
		}
		return vezes;

	}

}
