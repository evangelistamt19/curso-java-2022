package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		// Atribuição por valor vs por referencia 
		
		/*
		 * na atribuição como valor é feita nos tipos primitivos, basicamente, quando voce atribuiu pelo valor como o ex abaixo
		 * ele cria um espaço na memoria para a com o valor 2 e quando voce atribuiu b = a ele cria um outro espaço
		 * como copia de a, e os dois espaços sao independentes, ou seja voce pode manipular cada um separadamente
		 * sem influeniciar o outro em nada
		 */
		
		double a =  2; 
		double b = a; // Atribuição por valor
		
		// alterando o valor de cada um para mostrar que são independentes
		a++;
		b--;
		
		System.out.println(a + " " + b); // a = 3.0 e b = 1.0
		
		
		
		/*
		 * Na atribuição por referencia é feita em objetos e ocorre que quando voce atribui
		 * ele nao cria mais uma copia e sim um espaço na memomerio com o mesmo endereço de memoria
		 * do primeiro objeto ( oq vc estiver referenciando ) ou seja dif do primeiro caso, o os obejtos nao criam um
		 * espaço da memoria com o valor e sim com o endereço de memoria que ai sim tem o valor ex:
		 */
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referencia
		
		// como os dois objetos ocupam o mesmo endereço de memoria, não são independentes ou seja caso altere o valor de um o outro tbm ira sofrer ate que cada um tenho um espaço
		
		System.out.println("\nd1 = " + d1 + " tem o mesmo espaço que d2 = " + d2); 
		
		
		//mesmo alterando somente o dia do d1 e depois o dia porem só do d2, eles mudam juntos pois não sao independetes 
		d1.dia = 19;
		System.out.println(d1.dia);
		d2.dia = 44;
		System.out.println(d1.dia);
		System.out.println(d2.dia);
			
	}
}
