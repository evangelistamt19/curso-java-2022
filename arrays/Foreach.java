package arrays;

public class Foreach {
	public static void main(String[] args) {
		double[] notas = {9.9,8.5,7,2,4.1};
		
		
		// foreach
		// usado pra percorrer o array todo, que é o mais comum, de um jeito mais simples
		for (double nota : notas) { // para cada valor do array notas percorrido, ele vai colocar o valor na variavel nota 
			System.out.println(nota);
		}
	}
}
