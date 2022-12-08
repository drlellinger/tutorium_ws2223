package dev.codescreen;

public class _03_Gauss {

    /*
    Aufgabe 03
    ==========
    Gauß hat raus gefunden, dass die Summe von 0 bis n
    gleich ( (n * (n+1)) / 2).
    Schreiben Sie eine Methode, welche ein int Zahl number
    als Argument hat und mit Gauß Gleichung die Summe
    von 1 bis number berechnet!

     */

	public int calculate(int number){
	 	int sum = 0;
        for (int i = 1; i <=number; i++) {
            sum = sum + i;
        }
        return sum; 
}
}
