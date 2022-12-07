package excontrole;

import java.util.Scanner;

public class Ex7 {
	/*
	 * 7. Criar um programa que enquanto estiver recebendo números positivos, 
	 * imprime no console a soma dos números inseridos, 
	 * caso receba um número negativo, encerre o programa. 
	 * Tente utilizar a estrutura do while.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int soma = 0;
		
		while(true) {
			if(numero > 0) {
				soma+=numero;
				System.out.printf("A soma dos numeros digitados é de: %d \n", soma);
				numero = entrada.nextInt();
			} else {
				break;
			}
		}
		
		System.out.println("Fim");
			
			
		entrada.close();
}
}
