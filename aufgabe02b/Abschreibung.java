package aufgabe02b;

import java.util.Scanner;

public class Abschreibung {
	public static void main(String[] args) {
		
		//Deklarierung und Initialisierung der Variablen und des Arrays:
		double bn;
		double a = 10000.00;
		int n = 5;
		double[] buchwert = new double[n];
		
		//Deklarierung und Init des Scanners:
		Scanner in = new Scanner(System.in);
		
		//Jahresangabe:
		int j=2000;
		int jahr;
		int t;
		
		//Setze Buchwert am Anfang des Zeitraums:
		bn = a;
		
		//Berechnung der Jahresbuchwerte:
		for (int i=0; i<n; i++) {
			bn =(double) bn - (a / n);
			buchwert[i] = bn;
		}
		
		//Neue Ausgabelogik:		
		System.out.println("Zu welchem Jahresabschluss soll der Buchwert angezeigt werden?");
		jahr = in.nextInt();
		in.close(); //Scanner schließen
		t = jahr - j;
		System.out.println("Buchwert im Jahr " + jahr + ": "+ buchwert[t]+ "€");
		
	}
}
