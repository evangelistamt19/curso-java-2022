package excontrole;

import java.util.Scanner;

public class Ex3 {
	/* Criar um programa que receba duas notas parciais, 
	 * calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
	 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	 * caso contrário imprime no console "Reprovado".
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.err.println(media);
			System.out.println("Aprovado");
		} else if(media < 7 && media > 4) {
			System.err.println(media);
			System.out.println("Recuperação");
		} else {
			System.err.println(media);
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
