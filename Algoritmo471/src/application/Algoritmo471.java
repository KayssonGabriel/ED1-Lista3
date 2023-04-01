package application;

import java.util.Scanner;

import util.Calc;

public class Algoritmo471 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite dividendo: ");
		double dividendo = sc.nextDouble();
		System.out.print("digite divisor: ");
		double divisor = sc.nextDouble();
		
		Calc calc = new Calc(divisor, dividendo);
		
		if(divisor > dividendo) {
			System.out.println("INVALIDO digite um numero menor do que o dividendo");
		}else {
			if(calc.divisor(dividendo, divisor)== 0) {
				System.out.print("Nenhuma vez");
			}else{
				System.out.print("Número de vezes: "+calc.divisor(dividendo, divisor));
			}
		}
		
		sc.close();

	}
}
