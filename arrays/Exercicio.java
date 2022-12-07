package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		// pode colocar os [] antes ou depois do nome, não importa
		int[] notas = new int[5];
		int b[] = new int[4]; 
		
		// array com duas dimensões ou seja um dentro do outro, cada um com tamanho de 3
		int[][] c = new int[3][3];
		
		//atribuindo a posição 0 o valor 7
		notas[0] = 7;
		notas[1] = 4;
		notas[2] = 3;
		notas[3] = 1;
		notas[4] = 9;
		
		System.out.println(notas[1]);
		
		//pegar o ultimo dado do array
		System.out.println(notas[notas.length - 1]); //tamanho do array -1
		
		//Para imprimir o array completo: utilizar a classe Arrays
		System.out.println(Arrays.toString(notas)); //nesse caso é usado o metodo toString que passa o array para uma string e poder ser exibida 
		
		
		
		//percorrer array
		int totalA = 0;
		for(int i = 0; i < notas.length; i++) {
			totalA += notas[i];
		}
		System.out.println("media = " + totalA / notas.length);
		
		
		
		// Outra maneira de inicar um array, colocando oa dados ja na inicialização
		int[] notasB = {8,4,3}; // sim é com {}
		
		int totalB = 0; 
		for(int x = 0; x < notasB.length; x++) {
			totalB += notasB[x];
		}
		System.out.println("media = " + totalB / notasB.length);
		
	}
}
