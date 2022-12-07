package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				// o continue diferente o break que para o laço por inteiro, apenas pula a iteração e vai pra prox
				continue; // nesse ex, toda vez que o o resto da div de i por 2 ser igual a 1 = ele pula essa iteração e vai pra prox
				//ou seja, nesse caso, mostra apenas os que o resto é igual a 0 (numeros pares)		
			}
			
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("/////////////////");
		System.out.println("");
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue; // nesse caso assim que a iteração for i == 5 ele pula e continua o laço exibindo os outros numeros
			}
			
			System.out.println(i);
		}
	}
}
