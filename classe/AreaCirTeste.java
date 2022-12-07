package classe;

public class AreaCirTeste {
	public static void main(String[] args) {
		AreaCir a1 = new AreaCir(5.7);
		System.out.println(a1.area());
		// a1.pi = 10; // a ide avisa  que é um atributo estatico da classe e nao dessa determinada instancia ou seja:
		//caso voce altere o valor de pi aqui, vai ser alterado em todas as instancias de dessa classe e nao somente no a1
		// resumindo colocando a1.pi = 10 o pi vai passar a valor 10 para a2 e para qualquer outra instancia criada
		
		
		// para alterar o valor de pi corretamente (que seja igual ao exemplo do pi que vc criou static) é so acessar diretamente com o nome da classe e não da instancia
		//AreaCir.pi = 3.1515; // agr sim alterado diretamente na classe e de maneira correta 
		
		// ^^^ POREM COMO TRANSF O PI EM CONTANTE DEPOIS NÃO É POSSIVEK ALTERAR, SUPONDO QUE NAO FOSSE UMA CONSTANTE (SEM O FINAL) o codigo do comentario acima seria a maneira correta de..
		// ^^^ acessar e alterar o valor do atributo da classe
		
		
		AreaCir a2 = new AreaCir(5);
		System.out.println(a2.area());
		
		
		System.out.println(AreaCir.PI);
		
		
		
		System.out.println(AreaCir.area(100)); //usando o metodo static area (não é precisa criar instancias coomo a1 e a2, metodo direto da classe, passado apenas o paramentro e calculando
		
		
		
		// DICA: quando o atributo esta em italico como por ex o out de System.out.println() significa que é um atributo de uma classe e nao de um objeto
	}
}
