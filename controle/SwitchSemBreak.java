package controle;

public class SwitchSemBreak {
	
	//Quase nunca vai usar sem o break mas mesmo assim esse comedia vai fazer os 2
	public static void main(String[] args) {
		int idade = 2;
		
		// temos 3 casos de idade, caso idade  = 3 como nao tem break, ele vai ter todos os outros case
		switch (idade) { //switch só recebe o valor, nao boolean que nem if ou while
		case 3: 
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
	}
	
}
