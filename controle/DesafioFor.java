package controle;

public class DesafioFor {
	public static void main(String[] args) {
		// ex: fazer esse codigo abaixo porem sem poder usar valor numerico para controlar o laço
		String v1 = "#";
		for(int i = 1; i < 5; i++) {
			System.out.println(v1);
			v1 += "#";
		}
		
		System.out.println();
		System.out.println("////////////////////////////////////////");
		System.out.println();
		
		//Meu jeito, gambiarra ferrada pra fazer o ex
		String valor = "#";
		for(String teste = "$$$$$$"; valor.length() < teste.length();) {
			System.out.println(valor);
			valor +="#";
		}
		
		
		System.out.println();
		System.out.println("////////////////////////////////////////");
		System.out.println();
		
		
		//como o prof fez
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
	}
}