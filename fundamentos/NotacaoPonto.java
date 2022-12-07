package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		
		String s = "Hello World"; // não é um tipo primitivo nem palavra reservada
		// nesse caso como não é um tipo primitivo é possivel usar o . que possibilita o uso de mudulos naquela string por exemplo
		s  = s.toUpperCase(); // nesse exemplo atribuimos a var s o valor de s todo em maiusculo
		System.out.println(s);
		
		s = s.replace("HELLO WORLD", "pinto");
		System.out.println(s);
		
		System.out.println("Matheus".toLowerCase()); // tbm é possivel usar direto no literal 
	
	}
}
