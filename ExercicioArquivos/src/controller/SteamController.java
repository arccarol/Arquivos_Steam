package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SteamController implements ISteamController {
	
	
	float media = (float) 410925.6;
	
	public SteamController() {
		super();
	}


	@Override
	public void ReadFile(String path) throws IOException {
	
		File arq = new File(path);
		 if (!arq.exists()) {
	            System.out.println("Arquivo não encontrado.");
	            return;
	        }

	        try (BufferedReader buffer = new BufferedReader(new FileReader(arq))) {
	        	 String Linha = buffer.readLine(); 
	  
	        	 System.out.println("NAME\t\t" +"Média");
	             System.out.println("-----------------------------------------------------------");
	             
	             while((Linha = buffer.readLine())!=null) {
	   			  String[] Game = Linha.split(",");
	                   String name = Game[0];
	                   String ano = Game[1];
	                   String mês = Game[2];
	                   String avg = Game[3];
	               
	            
	                   if (ano.equalsIgnoreCase("2019") && mês.equalsIgnoreCase("september")) {
	                	
	                	  
	                       System.out.println(name + "\t\t" + avg);
	                   }
	               
	   		}

	   		
	   	}catch (IOException e) {
	               System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	           }
		
	}
}
	
	



