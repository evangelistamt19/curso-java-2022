package Teste;
/*
 * 25. Imagine uma janela com dois TextBox (txtValor1 e txtValor2), quatro RadioButton (optSoma, optSubtrai, optMultiplica, optDivide), 
 * um Label (lblResultado) um Button (cmdCalcular) e outro Button cmdSair. Você deve criar uma classe chamada Calculadora, 
 * que deverá receber o conteúdo convertido para double de txtValor1 e txtValor em seu construtor, 
 * e armazenar estes dois valores em variáveis membro privadas.
Esta classe deve possuir uma outra variável membro chamada dResultado, também privada.
Esta classe deve possuir 4 funções membro (métodos) públicos, uma para cada operação, e dentro de cada uma das funções membro deve ser realizada 
a sua operação (exemplo: Soma() deverá somar as duas variáveis membro e armazenar em uma quinta variável chamada dResultado, 
Subtrai() deverá subtrair, e assim por diante).
Esta classe também deve possuir um método publica que retorne dResultado
 */
public class Calculadora {
	private static double txtValor1;
	private static double txtValor2;
	private static double dResultado;
	
	Calculadora(double txtValor1, double txtValor2) {
		Calculadora.txtValor1 = txtValor1;
		Calculadora.txtValor2 = txtValor2;
	}
	
	public static double somar() {
		Calculadora.dResultado = txtValor1 + txtValor2;
		return dResultado;
	}
	public static double subtrair() {
		Calculadora.dResultado = txtValor1 - txtValor2;
		return dResultado;
	}
	public static double multiplicar() {
		Calculadora.dResultado = txtValor1 * txtValor2;
		return dResultado;
	}
	public static double dividir() {
		Calculadora.dResultado = txtValor1 / txtValor2;
		return dResultado;
	}
	
	
	public static void main(String[] args) {
		new Calculadora(50, 10);
		System.out.println(Calculadora.somar());
		System.out.println(Calculadora.subtrair());
		System.out.println(Calculadora.multiplicar());
		System.out.println(Calculadora.dividir());

		
	}
	
	
	
	
	
}
