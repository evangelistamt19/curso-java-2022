package classe;

public class PrimeiroTrauma {
	
	// 
	
	int a = 3;
	
	public static void main(String[] args) {
		
		int a = new PrimeiroTrauma().a;
		
		System.out.println(a);
		
		// ou
		// assim em baixo é mais correto
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
		
		
		
		// voce não consegue acessar um obejeto não static num metodo static ou seja nesse caso ou voce pode fazer o exemplo acima onde voce instancia um novo objeto e apartir voce acessa 
		// o atributo
		// ou voce pode ir no objeto não static e transormar em static ex: static a = 3;
		
		

		
		
		
		
	}
	

}
