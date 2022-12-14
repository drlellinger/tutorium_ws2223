package dev.codescreen;

public class _01_Modification {
	
    /*
    Aufgabe 01
    ==========
    Schreiben Sie eine Methode, welche eine int Zahl n
    als Argument hat und folgendes tut:
    Is die Zahl n eine gerade Zahl, so wird die Zahl n verdoppelt.
    Ist n eine ungerade Zahl, so wird die Zahl n verdreifacht.

    z.b. ist n = 8, dann liefert die Methode 16 zurück
    z.b. ist n = 7, dann liefert die Methode 21 zurück

    Gegeben ist eine Dummy-Implementierung von der Methode:
    public int change(int n){ return 0; }
    Sie sollen die Methode implementieren:
     */

    public int change(int n){
        if((n%2)==0) {
        	n = 2*n;
        }
        else {
        	n = 3*n;
        }
        return n;
    }
	
}
