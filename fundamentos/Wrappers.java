package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		// Wrappers são a versão obj dos tipos primitivos
		// ^^ é uma maneira de dar aos tipos primitivos, um comportamente de um obj
		// ^^ possibilitando por ex, o uso da notação ponto ex: s.alg metodo (com um
		// primitvo n da pra fazer isso)

		// byte
		Byte b = 1;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 10000000L;
		// dessa maneira esses 4 dados primitivos funcionam como classes

		System.out.println(b.compareTo(b)); // agr é possivel usar o notação ponto (ex apenas comparando um com o outro
											// = retorna 0 se forem iguais)
		
		System.out.println("#################################################");
		
		
		Boolean bo = Boolean.parseBoolean("true"); //transformando uma string num valor booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // tranf um valor booleano numa string depois colocando em caps
		//^^ isso nao ia dar certo se fosse usado o tipo primitivo boolean em minusculo, pois nao ia permitr o to string ou o to upper
		
		
		System.out.println("#################################################");
		
		Character c = 'M'; //char no wrapper
		System.out.println(c.toString()); // transf numa string
		
		System.out.println("#################################################");
		
		Float f = 123.0F; // tem que colocar o F no final para entender que não é int nem double
		System.out.println(f.hashCode()); //hash code desse float
		
		Double d = 123.5678;
		System.out.println(d.isInfinite());// verif se é infinito
		
		
		//RESUMINDO: SERVE PARA PODER USAR ESSES DADOS PRIMITIVOS COM UM COMPORTAMENTE DE UM OBJ
		
		

	}
}
