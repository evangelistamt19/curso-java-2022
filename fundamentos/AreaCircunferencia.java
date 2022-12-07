package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		double raio = 3.4; // double para numeros quebrados (tipo float no python)
		final double pi = 3.14159; // final = uma vez uma valor setado ele nao podera ser alterado (constante)
		
		//pi = 2; exemplo que gera erro pois o valor de pi ja foi definido com o final 
		
		double area = pi * raio * raio;
		System.out.println(area);
		
		//apos uma vez declarado a variavel, não é mais preciso e nem permitido colocar o tipo dela, pode chamar direto 
		raio = 10;
		area = pi * raio * raio;
		
		System.out.println("Area = " + area);
		
	}
}
