package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970); // usando this como função
		
	}
	
	Data(int diaD, int mesD, int anoD) {
		dia = diaD;
		mes = mesD;
		ano = anoD;
	}
	
	
	String obtDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
}
