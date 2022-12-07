package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		
		fila.add("Matheus");
		/*
		 * Funciona como add padrão porem filas podem ter um tamanho max, ou seja uma fila
		 * pode suportar por exemplo 30 valores, no .add caso o ele nao consiga add o valor pois
		 * ultrapassou o limite de 30 ele vai gerar um IllegalStateException um erro
		 */
		fila.offer("Ana");
		/*
		 * Já no offer ele tbm add valores na fila porem retorna True caso o elemente possa ser add caso não False
		 */
		
		//Pegar um elemento da fila
		//Peek e Elemente --> Obter o proximo elemento da fila sem remover
		System.out.println(fila.peek()); //peek retorna o primeiro elemento da fila, apenas o retorna e não remove depois, se a fila estivar vazia retorna um valor nulo
		System.out.println(fila.element()); // mesmo comportamente que o peek porem gera um erro caso a fila esteja vazia // erro --> NoSuchElementException
		
		
		// OUTROS EX DE METODOS COM A FILA
		//fila.size();
		//fila.clear();
		//fila.isEmpyty;
		
		System.out.println("");
		
		//poll e remove --> retorna o proximo elemento da fila e o remove
		
		System.out.println(fila.poll()); // retorna o proximo elemento da fila e o remove
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // aqui a fila ja esta vazia e ele retorna null
		
		System.out.println("");
		
		System.out.println(fila.remove()); // mesma coisa que o remove porem gera o NoSuchElementException caso a fila esteja vazia
		
		
		
	}
}
