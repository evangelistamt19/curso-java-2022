package fundamentos;

public class ConversaoTipoPrimiivoNum {
	public static void main(String[] args) {
		double a = 1; // conversão implicita pois o java transf o valor em ponto flutuante implicitamente 
		
		// float b = 1.0; // erro, nesse caso precisa ser explicito pois o java le o valor como double
		// ent é nescesssário fazer o casting vv
		
		//float b = 1.0F; // colocando o F para indicar que é um float ou vv
		float b = (float) 1.0; //exemplo de casting, é colocado o tipo da var que vc quer converter na frente 
		
		
		
	}
}
