package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Para usar o set da maneira mais correta, é passado entre < > o tipo de dado que vai ser agrupado nele, é convensão usar apenas um tipo
		//É possível notar a diferença, pois quando você usa por exemplo o metodo .add ele vai pedir apenas dados que se encaixam no tipo que você definiu vv
		//Exemplo abaixo : só vai ser possível adicionar dados do tipo String
		
		Set<String> lista = new HashSet<String>();
		//Set<String> lista = new HashSet<>(); tbm é possível criar um sem precisar passar novamente o tipo do dado no hashset() deixando apenas o <> vazio
		lista.add("teste");
		System.out.println(lista);
		
		lista.remove("teste");
		
		lista.add("Matheus");
		lista.add("Andre");
		lista.add("Caio");
		lista.add("Luis");
		System.out.println(lista);
		
		//Lembrando que o set não tem ordenação, ou seja não respeita a ordem dos valores que foram passados
		for(String canditado : lista) {
			System.out.println(canditado);
		}
		
		System.out.println(" ");
		
		//Caso você precise que a ordem seja respeitada usar o TreeSet<>()
		SortedSet<String> outraLista = new TreeSet<>();
		outraLista.add("Arroz");
		outraLista.add("Feijão");
		outraLista.add("Carne");
		
		
		for (String comida : outraLista) {
			System.out.println(comida); // A ordem que foi passada vai ser respeitada
		}
		
	}
}
