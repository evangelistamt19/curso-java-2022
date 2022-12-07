package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// tem que ser nota valida de 0 a 10
		// total
		// qtd de notas
		// para sair do prog o usuario tem que digitar -1
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota ou -1 para sair");
		Integer teste = entrada.nextInt();
		int total = 0;
		int qtdnotas = 0;
		
		while(!teste.equals(-1)) {
			if (teste >= 0 && teste <= 10) {
				System.out.println("Digite outra nota ou -1 para sair");
				total = total + teste;
				teste = entrada.nextInt();
				qtdnotas += 1;
			}
			else {
				System.out.println("Favor digitar um numero valido (0 a 10)");
				teste = entrada.nextInt();
			}
		} 
		int media = total / qtdnotas;
		
		System.out.printf("Voce digitou %d notas e a media e %d", qtdnotas, media );
		entrada.close();
	}
	
	
}

