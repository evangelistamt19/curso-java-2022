package excontrole;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		if (numero < 0 || numero > 10) {
			System.out.println("Numero não está entre 0 a 10");
			
		} else {
			if ((numero % 2) == 0){
				System.out.println("É par");
			} else {
				System.out.println("Numero não é par");
			}
		}
			
		entrada.close();
	}
}
