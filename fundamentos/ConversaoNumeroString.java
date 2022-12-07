package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 1000;
		System.out.println(num1.toString()); // converter um inteiro numa string
		System.out.println(num1.toString().length()); // ver a qtd
		
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2)); //  tbm é possivel fazer dessa forma
	}
}
