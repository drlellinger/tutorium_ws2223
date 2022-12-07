package aufgabe02d;

import java.util.Scanner;

public class Abschreibung {

	public static void main(String[] args) {
			//deklaration und init der Variablen und Objekte:
			LineareAbschreibung la = new LineareAbschreibung();
			ProgressiveAbschreibung pa = new ProgressiveAbschreibung();
			Scanner in = new Scanner(System.in);
			
			//Randbemerkung: man könnte auch eine weitere Klasse erstellen, um Anschaffungskosten, Nutzungsdauer und die Wahl der Abschreibungsart als Methoden zu erstellen...
			
			System.out.println("Möchten Sie linear (l) oder progressiv (p) abschreiben?");
			String w = in.next();
			
			switch(w) {
			case "l":
				la.setAnschaffungskosten();
				la.setNutzungsdauer();
				la.linearAbschreiben(la.getNutzungsdauer(), la.getAnschaffungskosten());
				la.inClose();
				break;
			case "p":
				pa.setAnschaffungskosten();
				pa.setNutzungsdauer();
				pa.progressivAbschreiben(pa.getNutzungsdauer(), pa.getAnschaffungskosten());
				pa.inClose();
				break;
			default:
				System.out.println("Fehlerhafte Eingabe");
				break;
			}
			
			in.close();
			
	}

}
