package excontrole;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		 //Criar um programa que receba um número e diga se ele é um número primo.
		
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		if(numero % 1 == 0 && numero % numero == 0) {
			System.out.println("é primo");
		} else {
			System.out.println("não é primo");
		}
		
		entrada.close();
	}
}
