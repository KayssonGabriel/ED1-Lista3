package applicaton;

import java.util.Scanner;

import util.Calc;

public class Algoritimo464 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("digite angulo em radianos: ");
		double ang = sc.nextDouble();
		Calc calc = new Calc(ang);
		calc.graus(ang);
		
		System.out.println("radianos: "+ calc.getAng()+" graus: "+calc.getG());
		

		sc.close();

	}

}
