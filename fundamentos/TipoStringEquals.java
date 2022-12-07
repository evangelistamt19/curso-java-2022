package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		//System.out.println("2" == "2"); //true, comparando duas strings
		
		String s = new String("2");
		System.out.println(s == "2");//false pois apesar do conteudo ser o mesmo o tipo não é, 2 sendo um tipo literal e s um objeto
		
		// para checar apenas se o conteudo é igual usamos o equal
		System.out.println(s.equals("2"));
		
		
		//outro exemplo onde esse problema pode acontecer bastante
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o numero: ");
		String s2 = entrada.next();
		
		System.out.println(s == s2); // false pois nao compara apenas o conteudo
		
		
		System.out.println(s.equals(s2)); //  true, comparando o conteudo
		
		
		//quando se usa o scanner o usuario pode colocar espaços em branco na entrada
		//uma maneira de resolver isso é com o .trim()
		
		System.out.println(s.equals(s2.trim())); //com o trim ele ignora os espaços e pega apenas o conteudo de fato digitado 
		
		
		entrada.close();
		
	}
}
