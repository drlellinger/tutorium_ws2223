package aufgabe02d;

import java.util.Scanner;

public class ProgressiveAbschreibung {
	//deklaration und init der Variablen und Objekte:
	Scanner in = new Scanner(System.in);
	private double bn;
	private int j=2000;
	private int jahr;
	private int t;
	private double a;
	private int n;
	private int nr;

	//Erstellen der Methoden:
	public void setAnschaffungskosten() {
		System.out.println("Wie hoch ist der Anschaffungswert?");
		this.a  = in.nextDouble();
	}
	
	public void setNutzungsdauer() {
		System.out.println("Wie lange ist die Nutzungsdauer in Jahren?");
		this.n  = in.nextInt();
		for(int i=1;i<=n;i++) { //Hier erstelle ich die arithmetrische Reihe für die Berechnung der progressiven Abschreiberaten
			this.nr+=i; 
		}
	}
	
	public double getAnschaffungskosten() {
		return this.a;
	}
	
	public int getNutzungsdauer() {
		return this.n;
	}
	
	//Methode um Scanner zu schließen:
	public void inClose() {
		in.close();
	}
	
	//Methode um die Abschreibung auszuführen:
	public void progressivAbschreiben(int n, double a) {
	
		double[] buchwert = new double[n];
	
		//Berechnung der Buchwerte:
		bn = a;
		
		for (int i=0; i<n; i++) {
			bn =(double)bn-((this.a/this.nr)*(i+1));
			buchwert[i] = bn;
		}
		
		
		//Abfrage des gewünschten Jahresabschlusses:
		do {
			System.out.println("Zu welchem Jahresabschluss soll der Buchwert und die vorherigen Buchwerte angezeigt werden?");
			jahr = in.nextInt();
			t=jahr-j;
		}
		while(n<=t);//Kontrollstruktur, damit keine höheren Werte als n angezeigt werden können
		
		for (int i=0; i<(t+1); i++) {
			System.out.println("Buchwert zum 31.12."+(j+i)+": "+ buchwert[i]+"€");
		}
		
		
		
		
	}
}
