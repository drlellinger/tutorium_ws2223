package dev.codescreen;

public class Kino {

    /*
     * Das Lichtspielhaus hat folgende Eintrittspreise:
     * Kleinkinder unter 3 Jahren sind frei.
     * Kinder von 3-12 Jahren zahlen 2 Euro.
     * Teenager von 13-17 Jahren zahlen 5 Euro.
     * Erwachsene zahlen 10 Euro.
     * Rentner (ab 65) zahlen 6 Euro.
     * Implementieren Sie die Methode getKinopreis(int alter),
     * die den Preis in Abhängigkeit vom Alter berechnet
     * und zurückgibt.
     */

    public int getKinopreis(int alter){
    	int r;
    	if (alter<3) {
    		r=0;
    	}
    	else if ((alter>=3)&&(alter<13)) {
    		r=2;
    	}
    	else if((alter>=13)&&(alter<18)) {
    		r=5;
    	}
    	else if((alter>=18)&&(alter<65)) {
    		r=10;
    	}
    	else {
    		r=6;
    	}
        return r;
    }
}
