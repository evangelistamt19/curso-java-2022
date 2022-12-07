package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PIlha {
	public static void main(String[] args) {
		//Primeiro a entrar é o ultimo a sair
		
		Deque<String> livros = new ArrayDeque<>();
		
		
		//add e push add elementos na fila
		livros.add("O pequeno Principe"); //retorna true casso add false caso n
		livros.push("ANTIFA"); // não retorna nada caso add, porem pode gerar IllegalStateException caso ultrapasse o limite, (se ele tiver sido definido)
		livros.push("Harry Potter");
		
		System.out.println(livros.peek()); //retorna o tultimo elemento que entrou pois segue a logica FIFO, Primeiro a entrar é o ultimo a sair
		System.out.println(livros.element());
		
		System.out.println("");
		
		
		System.out.println(livros.poll()); //remove primeiro, o harry potter ou seja o ulitimo a entrar
		System.out.println(livros.remove());
		
		System.out.println("");
		
		System.out.println(livros.pop()); // remove e retorna o primeiro elemento da fila, mesma coisa que o remove, tbm retorna uma exeção caso a pilha esteja vazia
		
		
		// OUTROS EX DE METODOS COM A PILHA
		//pilha.size();
		//pilhas.clear();
		//pilha.isEmpyty();
		//pilha.contains();
		
		
		
	}
}
