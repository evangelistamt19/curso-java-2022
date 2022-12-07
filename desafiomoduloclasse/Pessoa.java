package desafiomoduloclasse;

public class Pessoa {
	String nomeP;
	double pesoP;
	
	Pessoa(String nomeP, double pesoP) {
		this.nomeP = nomeP;
		this.pesoP = pesoP;
	}
	
	
	
	
	void Comer(double pesoC) {
		double pesoNovo = pesoP + pesoC;
		
		System.out.printf("O %s tinha %.3f Kg e ficou com %.3f Kg\n", nomeP, pesoP, pesoNovo);
		
		pesoP = pesoNovo;
		
		
		
		
		//FALTA DESCOBRIR COMO FAZER PARA QUE ESSE METODO SOME O PESO TODA VEZ QUE VC CHAME, ACUMULANDO O PESO 
		
		
	}
}
