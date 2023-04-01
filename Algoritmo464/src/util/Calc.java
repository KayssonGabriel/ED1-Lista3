package util;

public class Calc {
	private double ang;
	private double g;

	public Calc(double ang) {
		super();
		this.ang = ang;
	}

	public double getAng() {
		return ang;
	}

	public void setAng(double ang) {
		this.ang = ang;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}
	
	public void graus(double ang) {
		g = (ang * 180) / Math.PI;
	}
}
