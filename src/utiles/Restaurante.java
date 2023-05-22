package utiles;

import java.util.ArrayList;

public class Restaurante {

	private ArrayList<Comanda> comandas;

	public Restaurante() {

		comandas = new ArrayList<>();

	}

	public void crearComanda(String Descripcion) {

		Comanda comanda = new Comanda(Descripcion);

		comandas.add(comanda);

	}

	public void atenderPrimeraComanda() {

		Comanda comanda = comandas.remove(0);

		System.out.println("Borrando" + comanda);

	}

	public void addComanda(Comanda comanda) {

		comandas.add(comanda);

	}

	public void atenderComanda(Comanda comanda) {

		boolean resultado = comandas.remove(comanda);

		System.out.println("Borrando" + comanda);

	}

	public String toString() {
		return comandas.toString();
	}
	
	
	
//guardar comanda para escribirla
	//static
	public  void save() {

		
		Escribir Escr = new Escribir();		
		
		Escr.save(comandas.iterator());
		
		
	}

}
