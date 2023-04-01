package application;

import java.util.Scanner;

import util.Calc;

public class Algoritimo463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite angulo em graus: ");
		double ang = sc.nextDouble();
		Calc calc = new Calc(ang);
		calc.radiano(ang);
		
		System.out.println("graus: "+ calc.getAng()+" radianos: "+calc.getR());
		

		sc.close();

	}

}
