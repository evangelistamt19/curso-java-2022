package fundamentos;

public class OperadorLogico {
	public static void main(String[] args) {
		boolean opa = true;
		boolean apo = 10 > 5;
		
		System.out.println(opa && apo);// AND
		System.out.println(opa || apo); // OR
		System.out.println(opa ^ apo); // OR exclusivo = verdadeiro se os dois operandos forem diferentes
		System.out.println(!opa); //NOT
		
		
	}

}
