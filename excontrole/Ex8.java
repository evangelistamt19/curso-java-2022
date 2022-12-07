package excontrole;


import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		/*
		 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
		 */
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();


		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(letras[i]);
		}

		
	}
}

