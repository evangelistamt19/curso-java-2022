package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25; // por padrao vai ser 25 a não ser que alterem e vai valer para todos
	
	
	Produto(){ //produto sem parametros
		
	}
	
	// lembrar: podem ter o mesmo nome desde que a assinatura seja dif
	
	//produto com os 3 paramentros ja definidos, obrigando a serem passados para a criação de um objeto
	Produto(String nomeInic, double precoInic) {
		nome = nomeInic;
		preco = precoInic;

	}
	
	
	
	
	
	
	// como ja temos os atributos preco e desconto definidos num produto não é nescesssario passar os mesmo nov como paramentro
	public double descontado() { 
		return preco * (1 - desconto);
	}
	
	
}








	
	
	// eu fiz desse jeito abaixo primeiro pq achei que tinha nescessidade de passar os parametros
	
	//static double descontado(double p, double d) {
		//return p * (1 - d);
	//}
	

