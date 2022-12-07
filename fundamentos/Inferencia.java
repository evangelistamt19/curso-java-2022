package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		// inferencia, é possivel usar apenar o var sem declarar o tipo da variavel usando apenar o var e o java vai inferir automaticamente
		//nesse cenario ao inves de atribuir o tipo double apenas usar o var, e o java vai colocar como double
		var b = 5.5; 
		
		//porem a inferencia no java não é dinamica, caso o valor atribuido seja um  double por ex, não é possivel atribuir uma string por ex a essa var
		//ex abaixo
		// b = "teste"; erro pois string =! de double
		
		
		byte a = 100;
		System.out.println(a);
	}
}
