package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		String x1 = entrada1.nextLine();
	
		System.out.println("Digite o segundo numero: ");
		String x2 = entrada1.nextLine();
		
		System.out.println("Escolha uma operacao:"
				+ " + - * / % ");
		String op = entrada1.nextLine();
		
		
		
		int num1 = Integer.parseInt(x1);
		int num2 = Integer.parseInt(x2);
		
	
		
		//maneira de checar valor digitado por cli e de acordo com o mesmo verificar qual operaçao vai ser utilizada, ex sem if
		int teste = op.equals("+") ? num1 + num2 
				: op.equals("-") ? num1 - num2 
						: op.equals("*") ? num1 * num2 
								: op.equals("/") ? num1 * num2 
										: num1 % num2;
		
		
		System.out.println(teste);
		
		
	
		entrada1.close();
		
		
		
	}
}
