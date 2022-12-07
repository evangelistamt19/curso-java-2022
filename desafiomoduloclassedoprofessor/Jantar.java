package desafiomoduloclassedoprofessor;


public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Batata", 0.225);
		Comida c2 = new Comida("alho", 0.755);
		
		//
		
		Pessoa p1 = new Pessoa("Pedro", 75.0);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		
	}
}
