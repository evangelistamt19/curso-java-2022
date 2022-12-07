package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		System.out.println("Favor Digitar quantas notas: ");
		Scanner entrada = new Scanner(System.in);
		int qtdNotas = entrada.nextInt();
		
		
		int[] notas = new int[qtdNotas];
		System.out.println("Favor Digitar as notas: ");
		for(int i=0; i < qtdNotas; i++) {
			int notasDigitadas = entrada.nextInt();
			notas[i] += notasDigitadas;
		}
		
		System.out.println(Arrays.toString(notas));
		int soma = 0;
		for (int nota : notas) {
			soma += nota;
		}
		
		System.out.println("A sua media é: " + soma / qtdNotas);
	}
}
