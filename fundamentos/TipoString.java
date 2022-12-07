package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("b"));
		System.out.println(s.startsWith("B"));
		System.out.println(s.toLowerCase().startsWith("b")); // passa tudo para minusculo, depois verifca se começa com b
		
		
		var nome = "Matheus";
		var sobrenome = "Evangelista";
		var idade = 20;
		var salario = 1800.00;
		// uma maneira de concatenar var com um texto é usando o System.out.printf, %s para string, %d para int, $f para double
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%f.", nome, sobrenome, idade, salario);
		System.out.println("");
		
		// nesse caso é usado o fstring para formatar o salario, colocando o numero de casas deseja apos a virgula
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println("");
		//ou assim para atribuir uma frase a uma var
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
