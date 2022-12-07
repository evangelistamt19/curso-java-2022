package Teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LerMostrar {
	
	public static void main(String[] args) throws IOException, FileNotFoundException  {
		//Lendo o arquivo com a lista de nomes
		File arquivo = new File("/media/matheus/Arquivos/Downloads-linux/listanome"); // colocar aqui entre " " o caminho desejado
		Scanner conteudoArquivo = new Scanner(arquivo);
		
		//Definindo o caminho do novo arquivo criado
		String novoArquivo = "/media/matheus/Arquivos/Downloads-linux/lista"; // colocar aqui entre " " o caminho desejado
		String conteudo = conteudoArquivo.nextLine();
		while(conteudoArquivo.hasNextLine()) {
			conteudo += conteudoArquivo.nextLine();
			FileWriter escrever = new FileWriter(novoArquivo);
			escrever.write(conteudo);
			escrever.close();
		}
		
		//Escrevendo o conteudo da lista de nomes em um novo arquivo

			
		}
		
		
	}
	
	
