package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		
		do {
			System.out.println("Digita ai porra");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("pinto"));
		
		
		entrada.close();
	}
}
