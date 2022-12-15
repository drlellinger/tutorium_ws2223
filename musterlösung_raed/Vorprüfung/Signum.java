package dev.codescreen;

public class Signum {

    /*
     * Implmentieren Sie eine Methode signum(zahl),
     * die 1 zurückgibt, falls zahl > 0 ist
     * 0 zurückgibt, falls zahl == 0 ist
     * -1 zurückgibt, falls zahl < 0 ist
     */

    public int getSignum(int zahl){
        int r;
        if (zahl>0) {
        	r=1;
        }
        else if (zahl==0) {
        	r=0;
        }
        else {
        	r=-1;
        }
    	return r;
    }
}
