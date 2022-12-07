package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		//JOptionPane.showInputDialog = abre uma tela visual que funcionada com entrada
		
		/*
		 * nesse codigo é aberto uma tela para o usuario digitar 2 valores
		 * esses dois valores são Strings e para poder somar é feito a conversão para o tipo double
		 * apos a conversão é atribuido a soma dos dois a var soma
		 */
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:"); 
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		
		//cria a var tipo double e usa Double.parseDouble para converter o valor 1 e 2 de string para double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		double soma = numero1 + numero2;
		
		
		System.out.println(soma);
	}
}
