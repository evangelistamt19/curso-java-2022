package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagucado {
	@SuppressWarnings({ "rawtypes", "unchecked" }) //silenciar as advertencias, só usou esse aqui pois o objetivo desse arquivo é jutsmante mostrar um conjunto bagunçado que gera advertencia
	public static void main(String[] args) {
		
		//Lembrando que essa forma de criar um set, sem ser homegenio, não é correto
		
		HashSet conjunto = new HashSet();
		
		
		//colections não aceitam tipo primitivo ou seja quando voce coloca um tipo primitivo, ele converte para a classe desse tipo primitivo
		conjunto.add(1.2); // double --> Double
		conjunto.add(true); // boolean --> Bolean
		conjunto.add("teste"); // aqui já é String
		conjunto.add(1); // int --> Interger
		
		//no set para vericar o tamanho, é com size(), e não com o .lenght
		System.out.println("Tamanho é " + conjunto.size());
		
		//não aceita valores duplicados, ou seja caso tu coloque, só um vai ser considerado
		conjunto.add(1.2); // é duplicado, mas não va contar
		System.out.println("Tamanho é " + conjunto.size());
		
		
		// para remover é o .remove, que retorna true caso consiga remover e false caso n
		System.out.println(conjunto.remove(1)); // true pois o valor existe no set e pode ser removido
		System.out.println("Tamanho é " + conjunto.size());
		
		
		//contaisn verifica se o valor existe nesse grupo, caso sim ret true caso não, false
		System.out.println(conjunto.contains(1.2)); //true pois o valor 1.2 existe no set
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(" ");
		
		Set nums = new HashSet(); // pode ser definido dessa forma tbm
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		System.out.println(" ");
		
		//Para fazer uma união de dois sets = add.All, junta os valores de dois sets
		conjunto.addAll(nums); //valores do conjunto junto com o de nums, conceito de união
		System.out.println(conjunto);
		
		System.out.println(" ");
		
		//Interseção
		conjunto.retainAll(nums); //ness caso ele retem no set conjunto apenas oq tem no  nums, conceito interceção
		System.out.println(conjunto);
		
		System.out.println(" ");
		
		//Limpar todo o set
		conjunto.clear(); //vazio, vai limpar tudo
		System.out.println(conjunto);
		
		
		
		
		
		
	}
}
