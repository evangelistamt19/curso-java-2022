package classe;

public class PessoaEntenderThis {

	//O This serve para poder indicar o objeto da classe que esta sendo usado no momento
	
	//Nos casos abaixo é util pois os paramentros tem o mesmo nome que o atributo da classe
	
	// E tbm é util lá no caso MAIS abaixo que voce ja tem um atributo preenchido na classe e quer criar um atributo de instancia com o mesmo nome porem com outro valor
	
	String nome;
	
	PessoaEntenderThis(String nome) {
		// nesse caso isso não faz sentido pois a intenção é pegar o nome como parametro e passar para a var nome da classe
		// mas aqui em baixo voce só ta falando que o paramentro é igual ao paramentro ao paramentro (reterna null)
		// nome = nome; 
		this.nome = nome; // com o this voce fala que o atributo da classe recebe o nome passado no paramentro
		
	}
	
	
	
}
	
	// EX 1 DE USO DO THIS ( É IMPORTANTE SEU MERDA LE)

	//PessoaEntenderThis() {
		//String nome = "Andre";
		//System.out.println(this.nome); 
	
	
				// ex this, nesse caso ele iria referenciar o nome que contem Andre por ser um atributo da instancia
				// porem com o this.nome voce referencia o atributo da classe PessoaEntenderThis e não da instancia ou construtor ou objeto PessoaEntenderThis
				// ou seja ele leu o nome da classe que nesse caso é Carlos
		
	
	
	


