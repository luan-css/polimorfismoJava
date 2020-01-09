package com.br.gft;

import com.objetos.Carro;
import com.objetos.Aviao;
import com.objetos.Caminhao;

public class Main {

	public static void main(String[] args) {
		Carro car = new Carro ("FORD", "Convercivel", "POO-1010", "rosa", 0, false, 5, 0, 13.10, 5); 
		Aviao avi = new Aviao("GOL", "Jato", "AEREO-10", "Branco", 0, true, 0, 0, 13.000, 0, "jato esporte", "viagem");
		Caminhao cam = new Caminhao ("Mercedes", "Pipa" , "POL-2010", "Cinza" , 0, false, 0, 0, 10.000, 3, "Esportivo", "Carga");
		
		
		avi.frear();
		avi.ligar();
		avi.frear();
		avi.acelerar();
		avi.acelerar();
		avi.abastecer("2000");
		System.out.println(avi.getLitrosCombustivel());


		
	}
	
	

}
