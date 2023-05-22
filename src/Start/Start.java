package Start;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import utiles.Comanda;
import utiles.Restaurante;

public class Start {

	public static void main(String[] args) {
	
		
		Restaurante restaurante = new Restaurante();
		
		
		Comanda comanda1 = new Comanda("Tortilla patatas");
		Comanda comanda2 = new Comanda("Pizza");
		Comanda comanda3 = new Comanda("Patatas");
		
		
		
		restaurante.addComanda(comanda1);
		restaurante.addComanda(comanda2);
		restaurante.addComanda(comanda3);
	
		restaurante.save();
		
		System.out.println(restaurante);
		//quitar comanda
		restaurante.atenderComanda(comanda3);
		
		System.out.println(restaurante);
		
		
	
		
	

	}

}
