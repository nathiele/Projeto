package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Arquivo {
	
	public static void main(String args[]) throws Exception {
		
		 /*Gravação
		 FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 0; i < 1000; i++) {
			 gravarArq.println("valor de i: " + i); 
		 }
		 arq.close();
		
		 /*Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains("teste")) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close(); */
		
		/*alterar 
		String[] dados = new String[1000];
		
		int linhas, numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog( null, ("Digite um número")));
		linhas = Integer.parseInt(JOptionPane.showInputDialog( null, ("Digite uma linha")));
		
		FileReader arqalterar = new FileReader("d:\\teste.txt");
		 BufferedReader alterarArq = new BufferedReader(arqalterar);
	 
	     String linha = alterarArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 
	    	 if(linha.contains("valor de i") && i+1== linhas) {
	    		 dados[i] = "valor de i" + numero; 
	    	 } else {
	    		 
	    		 
	    	 	dados[i] = linha; }
	    	   i++; 
	    		 linha = alterarArq.readLine();
	    	  	 
	}
	     // GRAVAR
		
	     FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int j = 0; j < 1000; j++) {
			 gravarArq.println(dados[j]); 
		 } 
		 arq.close();*/
		 
		 //deletar
		 
		 String[] dados = new String[1000];
			
			int linhas;
			
			linhas = Integer.parseInt(JOptionPane.showInputDialog( null, ("Digite uma linha")));
			
			FileReader arqdeletar = new FileReader("d:\\teste.txt");
			 BufferedReader deletarArq = new BufferedReader(arqdeletar);
		 
		     String linha = deletarArq.readLine(); 
		     int i = 0;
		     
		     while (linha != null) {
		    	 
		    	 if(linha.contains("valor de i") && i+1!= linhas) {
		    		 
		    			
		    	 
		    	 dados[i] = linha;
		    	 }else
		    	 { 
		    		 linha = deletarArq.readLine();
		    		 dados[i] = linha;
		    	 
		    	 }
		    	 linha = deletarArq.readLine();
		    	 i++;
		    	 } 
		     
		     FileWriter arq = new FileWriter("d:\\teste.txt");
			 PrintWriter gravarArq = new PrintWriter(arq);
		     for(int j = 0; j < 1000; j++) {
				 gravarArq.println(dados[j]); 
			 } 
			 arq.close();
		    
    		
}}
