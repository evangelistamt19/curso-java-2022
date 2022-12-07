package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		// notas mais de um aluno
		//quantos alunbos tem na turma
		//quantas nota cada aluno tem 
		//criar array dentro de outro
		
		//calcular media turma toda
		
		
		System.out.println("Quantos alunos tem na turma ? \n");
		Scanner entrada = new Scanner(System.in);
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quntas notas por aluno ? \n");
		int qtdNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("informe a nota %d do aluno %d: ", n+1, a+1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A MEDIA DA TURMA E " + media);
		
		
		entrada.close();
		
		
		
		
	}
}
