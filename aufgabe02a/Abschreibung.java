package aufgabe02a;

public class Abschreibung {
	public static void main(String[] args) {
		
		//Deklarierung und Initialisierung der Variablen und des Arrays:
		double bn;
		double a = 10000.00;
		int n = 5;
		double[] buchwert = new double[n];
		
		//Optional: Jahresangabe:
		int j=2000;
		
		//Setze Buchwert am Anfang des Zeitraums:
		bn = a;
		
		//Ausgabe über Kontrollstruktur:
		for (int i=0; i<n; i++) {
			bn =(double) bn - (a / n);
			buchwert[i] = bn;
			System.out.println("Buchwert zum 31.12."+(j+i)+": "+ buchwert[i]+"€");
		}
		
	}
}
