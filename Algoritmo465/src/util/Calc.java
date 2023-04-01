package util;

public class Calc {
	private int num1;
	private int num2;

	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void verifica(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}

}
