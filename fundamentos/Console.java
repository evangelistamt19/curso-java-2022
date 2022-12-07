package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//print sem o ln imprime tudo na mesma linha
		System.out.print("Bom");
		System.out.print(" Dia\n");
		
		// usar o Scanner para pegar dados no console
		Scanner entrada = new Scanner(System.in);  // System.in pois aqui  o java vai pegar uma entrada diferente do out para mostrar no console
		// com apenas uma entrada você pode ir pegando varios dados e alocando em var
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine(); // é usado o next Line para o console aguardar uma string digitada nele, e nesse caso alocado numa var chamada nome
		
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt(); // nesse caso como é um inteiro, usamos o nextInt
		
		
		System.out.printf("\nSeu nome é %s %s.", nome, sobrenome);
		System.out.printf("\nVocê tem %d anos", idade);
		
		
		
		
		entrada.close(); // no java nesse caso é nescessario fechar o scanner para nao ficar usando espaço desnecessario em memoria 
		
		
		
		
		
	}
}
