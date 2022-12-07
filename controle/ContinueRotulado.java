package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) { //primeiro laçõ for com rotulo de "externo"
			interno: for (int j = 0; j < 3; j++) { //segundo laço for com rotulo de "interno"
				if (i == 1) {
					// por padrão apenas com o continue, ele vai pular para a proxima interação do laço for interno
					continue externo; // porem com o rotulo especificado é possivel escolher onde o continue vai agir, indo para a proxima interação do laço externo (nesse caso)
				}
			}
		}
	}
}
