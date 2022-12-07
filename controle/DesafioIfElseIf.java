package controle;

import java.util.Scanner;


public class DesafioIfElseIf {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Digite um dia da semana // sem acento e tals pq n sei arrumar a merda do encoding");
		String semana = entrada.nextLine();
		
		
		semana.toLowerCase();
		
		System.out.println(semana);
		
		int numsemana;
		
		
		if (semana.equals("domingo")) {
			numsemana = 1;
		} 
		else if (semana.equals("segunda")) {
			numsemana = 2;
		}
		else if (semana.equals("terca")) {
			numsemana = 3;
		}
		else if (semana.equals("quarta")) {
			numsemana = 4;
		}
		else if (semana.equals("quinta")) {
			numsemana = 5;
		}
		else if (semana.equals("sexta")) {
			numsemana = 6;
		} else numsemana = 7;
		
			
		
		System.out.println(numsemana);
		
		
		
		entrada.close();
	}
}
