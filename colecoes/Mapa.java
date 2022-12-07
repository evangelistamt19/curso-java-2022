package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		//Dois valores, Chave e valor
		Map<Integer, String> usuarios = new HashMap<>(); //Chave = tipo integer e valor tipo Sring
		// O metodo .put ele adiciona caso não exista e caso ja exista, ele sobrescreve
		// nesse caso foi criado uma chave com o valor Matheus e depois essa mesma chave passou a ter o valor Gabriel
		usuarios.put(1, "Matheus");
		usuarios.put(1, "Gabriel");
		usuarios.put(2, "Luisa");
		usuarios.put(3, "Caio");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios);
		
		System.out.println("");
		
		System.out.println(usuarios.isEmpty()); //False né n ta vazio
		
		System.out.println("");
		
		System.out.println(usuarios.keySet()); //mostra apenas as chaves
		
		System.out.println(usuarios.values()); //mostra apenas os valores
		
		System.out.println(usuarios.entrySet()); //chave e valor ao mesmo tempo
		
		//Como voce tem chave e valor agora voce pode usar o cotains, separado para ver se existe a chave e o valor:
		System.out.println(usuarios.containsKey(7)); //falso pois só tem chave ate o 3
		System.out.println(usuarios.containsValue("Gabriel")); //True pois existe o valor Gabriel 
		
		System.out.println("");
		
		//Pegar um elemento, não tem indice então tem que ser pelo a chave
		System.out.println(usuarios.get(3)); //Caio
		
		
		
		//Percorrer um map
		//- PELA CHAVE
		for(Integer chaves: usuarios.keySet()) {
			System.out.println(chaves); // mostra todas as chaves
		}
		
		System.out.println("");
		
		//- PELO VALOR
		
		for(String valores:usuarios.values()) {
			System.out.println(valores); //mostra todos os valores
		}
		
		System.out.println("");
		
		//- CHAVE/VALOR
		//tem que ser do tipo Entry
		for(Entry<Integer, String> teste:usuarios.entrySet()) {
			System.out.println(teste); //mostra todos os chaves e valores
		}
		
		System.out.println("");
		
		//remover
		System.out.println(usuarios.remove(1)); //é passado a chave e ele exclui, true pois tem chave 1 e vai ser removida, retorna a chave exluida
		System.out.println(usuarios.remove(7, "luis")); // false pois não tem chave 7 e nem valor luis então n
		
		System.out.println(usuarios);
		
	}
}
