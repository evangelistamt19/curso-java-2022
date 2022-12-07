package controle;

public class Break {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break; // vai quebrar o laço assim que essa condição ser true, saido diretamente do laço for e indo para a prox linha fora do laço
			}
		}
		System.out.println("saiu do laço");
	}
}
