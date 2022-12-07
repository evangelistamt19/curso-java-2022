package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite média");
		double media = entrada.nextDouble();
		
		if (media >= 6)
			System.out.println("Aprovado");
		
		//QUANDO TEM MAIS DE UMA SETENÇA TEM QUE COLOCAR DENTRO DE UM BLOCO {}
		if (media >= 8) { 
			System.out.println("APROVADO");
			System.out.println("FOI BEM PRA CARALHO EIN");
		}
		
		
		entrada.close();
	}
}
