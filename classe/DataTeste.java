package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();

		
		Data d2 = new Data(15,4,2002);
		
		String datinhaTeste = d2.obtDataFormatada();
		System.out.println(datinhaTeste);
		
		
		
		
		System.out.printf("Matheus nasceu no dia " + datinhaTeste + "\n"); // forma com o metodo criado btDataFormatada()
		System.out.printf("Larissa nasceu no dia %d/%d/%d", d2.dia, d2.mes, d2.ano); // forma sem metodo acessando os atrubutos diretamente
	}
}
