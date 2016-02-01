import java.util.Date;

public class Primzahlen {

	public static void main(String[] args) {
		
		
		int limit = 100;
		int zahl; // ist jede Zahl bis z.B.:100
		int teiler; // Zahl durch die dividiert wird
		boolean primzahl;

		for (zahl = 2; zahl <= limit; zahl++) {

			primzahl = true;

			for (teiler = 2; teiler <= zahl / 2; teiler++) {
				if (zahl % teiler == 0) {

					primzahl = false;
					break;
				}

			}

			if (primzahl) {
				System.out.println(zahl + " ist eine Primzahl");
			}
			
		}
	
	}
	
}