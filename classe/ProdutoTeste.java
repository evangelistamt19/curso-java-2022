package classe;



public class ProdutoTeste {
	public static void main(String[] args) {
		//instanciada
		//abaixo estou criando produtos instanciados com os atributos da classe Produto agora definidos
		// new chama o construtor Produto()
		
		Produto.desconto = 0.30;
		Produto p1 = new Produto("Teclado", 300.00); //Produto criado diretamente com construtor na classe e passando todos os atributos
		Produto p2 = new Produto("Pinto", 100.00);

		
		
		
		

		//ou seja o p1 e p2 recebem os atributos da classe Produto
		
		
		// quando chama com () é um metodo agr quando não tem é um atributo
		
		double resultado = p1.descontado(); // resultado = metodo descontado aplicado no objeto p1
		double resultado2 = p2.descontado();
		System.out.println(resultado);
		System.out.println(resultado2);
		
		
		
		
		
		
		
		
		/*
		 * abaixo é no caso de não usar metodos
		 * 
		 * double precoFinal1 = p1.preco * (1 - p1.desconto);
			double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		//System.out.println(p1.nome); // para acessar utilizar a notação ponto, *nome da instancia* ponto *atributo*
		
		
		//System.out.printf("O preco final do %s e de %f \n", p1.nome, precoFinal1);
		//System.out.printf("O preco final do %s e de %f", p2.nome, precoFinal2);
		 * 
		 * 
		 * 
		 * 
		 * 	// eu fiz desse jeito abaixo primeiro pq achei que tinha nescessidade de passar os parametros
	
			//double resultado = Produto.descontado(p1.preco, p1.desconto);
			//System.out.println(resultado);
		
		 * 
		 */
		
		
	
		
		
		
		
		
	}
	

			
			
}
