package desafiomoduloclassedoprofessor;

public class Pessoa {
	String nomeP;
	double pesoP;
	
	Pessoa(String nomeP, double pesoP) {
		this.nomeP = nomeP;
		this.pesoP = pesoP;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoP += comida.pesoC;
		}
	}
	
	String apresentar() {
		return "Oi eu sou o " + nomeP + " e tenho " + pesoP + "kg";
	}
	
}
