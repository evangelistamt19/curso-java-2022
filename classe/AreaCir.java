package classe;

public class AreaCir {
	double raio;
	// colocando o final voce transforma o valor numa constante = ou seja nunca muda // nao permite ser alterada
	// por conversão constantes no java são em MAISCULAS
	static final double PI = 3.14; // static serve para falar que esse atribudo é da propria classe e nao da instacia e nao muda
	
	
	
	public AreaCir(double raioInicial) {
		raio = raioInicial;
		
	}
	
	
	double area() {
		return (raio * raio) * PI;
	}
	
	// metodo static ou seja um metodo direto da classe e não de uma instancia criada
	static double area(double raio) {
		return (raio * raio) * PI;
	}
}
