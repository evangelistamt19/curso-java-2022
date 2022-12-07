package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuario = new HashSet<>();
		usuario.add(new Usuario("Matheus"));
		usuario.add(new Usuario("Tadeu"));
		usuario.add(new Usuario("Monica"));
		
		boolean resultado = usuario.contains(new Usuario("Tadeu"));
		System.out.println(resultado);
		
	}
}
