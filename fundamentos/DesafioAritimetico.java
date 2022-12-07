package fundamentos;

public class DesafioAritimetico {
	public static void main(String[] args) {
		int conta1 = 6 * (3+2);
		int linha1 = (int) Math.pow(conta1, 2);
		int finalconta1 = linha1 / (3 * 2);

		
		
		int conta2 = (1-5) * (2-7);
		int linha2 = conta2 / 2;
		int finalconta2 = (int) Math.pow(linha2, 2);

		
		int result = finalconta1 - finalconta2;

		
		
		int slaporra = (int) Math.pow(result, 3) / (int) Math.pow(10, 3);
		
		System.out.println(slaporra);
		
		
	
		
	}
}
