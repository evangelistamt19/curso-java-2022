package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Matheus Evangelista";
		u1.email = "matheusevangelista1920@gmail.com";
		
		
		Usuario u2 = new Usuario();
		u2.nome = "Matheus Evangelista";
		u2.email = "matheusevangelista1920@gmail.com";
		
		System.out.println(u1 == u2); //False pois == compara o endereço de memoria
		// System.out.println(u1.equals(u2)); // False pois por padrão equals tbm compara por endereço de memoria
		System.out.println(u1.equals(u2)); //True, pois agr foi implementado o metodo equals na classe usuario ou seja o comportamente não é mais padrão e sim de acordo com oq foi defin na classe
		//Agora o equals compara se de fato um objeto é igual ao outro
		
		
		
	}
}
