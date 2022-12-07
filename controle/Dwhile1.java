package controle;

import java.util.Scanner;

public class Dwhile1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = "nada";
		
		while (!palavra.equalsIgnoreCase("sair")) {
			palavra = entrada.nextLine();
		}
		
		System.out.println(palavra.toLowerCase());
		
		entrada.close();
	
	}
}
			
			


