package utiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Escribir {
	private static String FicheroSalida = "C:\\Users\\Mañana\\Downloads\\Escribir.txt";

	public static void save(Iterator<Comanda> comandas) {

		try {

			FileWriter file = new FileWriter(FicheroSalida);

			while (comandas.hasNext()) {
				Comanda comanda = comandas.next();

				file.write(comanda.toString());

				

			}
			file.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
