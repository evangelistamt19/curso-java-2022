package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		// ArrayList<Usuario> lista = new ArrayList<>(); assim e a linha de baixo é a mesma coisa
		List<Usuario> lista = new ArrayList<>(); // Lista de usuarios, ou seja nesse caso, o tipo dos valores da lista é instancias da classe usuarios, ou seja os usurios
		
		//Podemos add de duas maneiras
		
		//1° Criando o usuario e depois passando a instancia para o .add
		Usuario u1 = new Usuario("Matheus");	
		lista.add(u1);
		
		// or
		
		
		//No proprio add criando um novo usuario, dessa forma
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Tania"));
		lista.add(new Usuario("Sergio"));
		lista.add(new Usuario("Lucas")); // aceita repetição
		
		System.out.println(lista.get(0).nome); //acessar uma posição, é possível pois é indexada, sintaxe = *nome da lista*.get(*poisição*).*nome do atributo*
		
		System.out.println(" ");
		
		
		//Existem duas formas de remover valores numa list
		lista.remove(0); //pelo indice desejado 
		System.out.println(lista); //implicitamente o java passa o metodo to.String() quando chamamos dessa forma, e esse metodo foi editado na classe usuario, favor se atentar
		
		
		lista.remove(new Usuario("Tania")); // recebe um objeto que nesse caso é o usuario 
		System.out.println(lista);
		
		
		System.out.println(" ");
		
		
		//TBm é possivel usar o contains para verificar se um objeto existe na lista
		System.out.println("Tem ? " + lista.contains(new Usuario("Sergio"))); // Retornia False pois aponta para outro objeto na memoria, porem como a classe equals foi editada no Usuio vai ret true
																   // poi nesse caso ele vai conseguir diferenciar 
		
		
		System.out.println(" ");
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome); //A ordem vai ser preservada, pois a list é ordenada
		}
		
		
	}
}
