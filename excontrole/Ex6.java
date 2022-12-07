package excontrole;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		/* 6. Jogo da adivinhação: 
		 * Tentar adivinhar um número entre 0 - 100. 
		 * Armazene um numero aleatório em uma variável. 
		 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
		 * e imprima se o número inserido é maior ou menor do que o número armazenado.
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor digite um numero entre 0 a 100");
		int tentativa = entrada.nextInt();
		
		int numCorreto = 10;
		
		int tentativasRest = 10;
		
		while(tentativasRest != 0) {
			if(tentativa == numCorreto) {
				System.out.println("Parabens tu acertou seu merda");
				break;
			} else if(tentativa < numCorreto) {
				tentativasRest -= 1;
				System.out.printf("%d e menor que o numero correto \n", tentativa);
				System.out.printf("Voce tem %d tentativas restantes \n", tentativasRest);
				 if (tentativasRest == 0) {
						System.out.printf("perdeu otario, numero correto e %d \n", numCorreto);
					}
				tentativa = entrada.nextInt();
			
			} else if(tentativa > numCorreto) {
				tentativasRest -= 1;
				System.out.printf("%d e menor que o numero correto \n", tentativa);
				System.out.printf("Voce tem %d tentativas restantes \n", tentativasRest);
				 if (tentativasRest == 0) {
						System.out.printf("perdeu otario, numero correto e %d \n", numCorreto);
					}
				tentativa = entrada.nextInt();
			
			}
				
		}
		
	
		
		
		
		
		
	}
}
