package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//java não analiza o valor e sim o tipo
		// No java existem 8 tipos primitivos sendo 6 numericos e
		// desses 6 numericos 4 são para inteiros, byte = 1bites, short = 2, int=4,long=8
		// oq muda é o espaço que eles armazenam na memoria
		// os outros 2 são para numberos quebrados o float=4bits e double=8bits
		
		
		//os outros 2 é o char que representa uma letra e o boolean que representa verdadeiro ou falso
		
		
		//informações do funcionario
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		// os _ servem apenas para melhor visualização do numero, não muda em nada o codigo
		long pontosAcumulados = 3_134_845_223L;//nesse caso é colocado um L de long do lado para o java entender que não é mais um int e sim um long 
		
		
		//tipos numericos reais
		float salario = 11_445.44F; //nesse caso é preciso colocar o f de float para indicar que isso é uma literal float e não um double
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//tipo booleano
		boolean estaDeFerias = false; // true ou false apenas não da pra colocar 0 ou vazio pois não vai interpretar como false
		
		//tipo caractere
		char status = 'A'; // ativo
		
		
		//só pra usar as var
		System.out.println("Fulano tem "+ anosDeEmpresa * 365 + " dias de empresa");
		System.out.println("Fulano fez "+ numeroDeVoos / 2 + " viagens");
		System.out.println("Fulado com id " + id + " ganha " + salario);
		System.out.println("Fulano tem " + pontosAcumulados / vendasAcumuladas + "pontos por real");
		System.out.println("Fulano esta de ferias ? " + estaDeFerias);
		System.out.println("Status: "+ status);
		
		int[] iDados = new int[2];
		System.out.println(iDados);
		
	}
}
