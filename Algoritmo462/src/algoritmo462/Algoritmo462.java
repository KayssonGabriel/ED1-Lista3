package algoritmo462;

import java.util.Scanner;

public class Algoritmo462 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calc calculadora = new Calc();
		
		System.out.println("digite nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("digite nota 2: ");
		double n2 = sc.nextDouble();
		System.out.println("digite nota 1: ");
		double n3 = sc.nextDouble();
		
		
		System.out.println("media aritmetica é "+calculadora.media(n1, n2, n3));
		System.out.println("media armazenada em variavel = "+calculadora.ma);
		
		sc.close();

	}

}