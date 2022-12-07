package controle;

public class BreakRotulado {
	// recomenado nao ficar usando esse tipo de break
	// o break rotuluado é quando vc rotula um for por exemplo e no momendo de colocar o break
	// voce pode especificar qual laço voce quer interromper, supondo que tem mais de um
	// ex abaixo
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) { //primeiro laçõ for com rotulo de "externo"
			interno: for (int j = 0; j < 3; j++) { //segundo laço for com rotulo de "interno"
				if (i == 1) {
					// por padrão apenas com o break, ele vai sair do laço for intermo pois é ondo a condição if esta
					break externo; // porem com o rotulo especificado é possivel escolher onde o break vai agir
				}
			}
		}
	}
}
