package excontrole;

public class Ex2 {
	//  Criar um programa informa se o ano atual é um ano bissexto;
	public static void main(String[] args) {
		int ano = 2024;
		
		if (ano % 4 == 0) {
			System.out.println("é ano bissexto");
		} else {
			if((ano % 100) != 0) {
			System.out.println("Não é ano bissexto né caralho");
			} else {
				if(ano % 400 == 0 ) {
					System.out.println("é ano bissexto");
				} else {System.out.println("Não é ano bissexto né caralho");}
			}
		}
		
	}
}
	


