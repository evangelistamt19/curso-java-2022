package desafiomoduloclasse;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.225);
		Comida c2 = new Comida("Frango", 0.755);
		
		//
		
		Pessoa p1 = new Pessoa("Matheus", 75.0);
		Pessoa p2 = new Pessoa("Luis", 89.0);
		
		//p1.comer(c1.pesoC);
		//p1.comer(c2.pesoC);
		
		p1.Comer(c1.pesoC);
		p1.Comer(c2.pesoC);
		
		
		p2.Comer(c2.pesoC);

		
		
	}
}
