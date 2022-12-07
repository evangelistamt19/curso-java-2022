package fundamentos;

public class OpUnario {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		// quando vc coloca ++ ou -- na esquerda ou seja antes
		// tem mais precedencia e na direita ou seja depois tem menos precedencia
		a++; // a = a + 1
		System.out.println(a);
		a--; // a = a - 1
		System.out.println(a);

		++b; // b = b + 1
		System.out.println(b);
		--b; // b = b - 1
		System.out.println(b);
		
		
		int teste1 = 1;
		int teste2 = 2;
		
		System.out.println(++teste1 == teste2--);
		//nesse ex vai retornar true pois primeiro ele acresenta no teste1 faz a comparação e apenas depois decrimenta no teste2
		// ou seja comparando 2 == 2
		
	}
	
}
