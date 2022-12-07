package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digita a nota: ");
		int nota = entrada.nextInt();
		
		
		switch(nota) {
		//no caso de ter o mesmo trecho de codigo para mais de um case, você pode colocar na mesma linha como no exemplo abaixo 
		case 10: case 9:
			conceito = "A";
			break; // break para parar o laço no caso de reconhecer o caso (nesse ex caso seja 10 ou 9 ele imprime A)
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3 :
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não informado";
		}
		
		
		System.out.println("A nota é " + conceito);
		
		
		entrada.close();
	}
}
