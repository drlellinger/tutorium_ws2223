package aufgabe02c;

public class Abschreibung {

	public static void main(String[] args) {
			//deklaration und init der Variablen und Objekte:
			LineareAbschreibung la = new LineareAbschreibung();
			
			la.setAnschaffungskosten();
			la.setNutzungsdauer();
			la.linearAbschreiben(la.getNutzungsdauer(), la.getAnschaffungskosten());
			la.inClose();
			
	}

}
