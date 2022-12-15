package dev.codescreen;

public class Spendenaktion {

    /*
     * Bei einer Spendenaktion hat der Fernsehsender ZRD zugesagt,
     * jede eingehende Spende ab 1 Euro zu verdoppeln.
     * Der Regionalsender YB3 erhöht jede eingehende Spende um 10 Euro.
     * Falls der Spendenbetrag (nach der Verdoppelung) mehr als 10 Euro ist
     * (ZRD verdoppelt bevor die 10 Euro von YB3 hinzugefügt werden.)
     * Versucht eine Person eine negative Spende einzugeben,
     * so liefert die Methode 0 zurück!
     *
     * Implementieren Sie die Methode berechneSpende(int n).
     */

	public int berechneSpende(int n){
        int r;
        if (n<1) {
        	r=0;
        }
        else if (n<6) {
        	r=n*2;
        }
        else {
        	r=(n*2)+10;
        }
        return r;
    }
}
