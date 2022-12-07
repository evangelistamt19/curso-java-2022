package fundamentos;

public class Temperatura {
	// (F - 32) X 59 = C
	
	public static void main(String[] args) {
		double f = 86;
		final int x = 32;
		final double fator = 5.0 / 9.0;
		double celcius = (f - x) * fator;
		
		System.out.println("O resultado e " + celcius);
		System.out.println(fator);
	}
	
	
}
