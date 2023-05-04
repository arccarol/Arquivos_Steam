package main;

import java.io.IOException;

import controller.ISteamController;
import controller.SteamController;



public class Principal {
	
	public static void main(String[] args) {
		ISteamController  arqCont = new  SteamController ();
		
		
		String path = "C:\\TEMP\\SteamCharts.csv" ;

		try {
		
			arqCont.ReadFile(path);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		}

	}


