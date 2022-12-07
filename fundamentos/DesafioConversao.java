package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//Entrada para os 3 salarios
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu salario");
		
		//salvar salarios nas variaveis
		String salario1 = entrada.nextLine();
		String salario2 = entrada.nextLine();
		String salario3 = entrada.nextLine();
		
		//substituindo , pelo ponto caso o usuario tenha digitado com virgula
		salario1 = salario1.replace("," ,".");
		salario2 = salario2.replace("," ,".");
		salario3 = salario3.replace("," ,".");
		
		
		// convertendo cada salario digitado em double
		double salarioFormatado1 = Double.parseDouble(salario1);
		double salarioFormatado2 = Double.parseDouble(salario2);
		double salarioFormatado3 = Double.parseDouble(salario3);
		
		//calculo de media
		double media = (salarioFormatado1 + salarioFormatado2 + salarioFormatado3) / 3;
		
		System.out.printf("o salario medio e de: R$%.2f", media);
		


		
		
		entrada.close();
	}
}
