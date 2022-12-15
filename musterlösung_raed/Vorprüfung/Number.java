package dev.codescreen;

public class Number {

    /*
     * Die Methode getOddNumber
     * überprüft, ob eine int n
     * eine ungerade Zahl (OddNumber) ist oder nicht.
     * Falls die Zahl n eine ungerade Zahl ist,
     * so wird n zurückgegeben! Sonst -1
     * Beispiel: getOddNumber(13) liefert dann 13
     * Beispiel: getOddNumber(24) liefert dann -1.
     */
    public int getOddNumber(int n){
    	int r;
    	if ((n%2)==1) {
    		r=n;
    	}
    	else {
    		r=-1;
    	}
        return r;
    }


}
