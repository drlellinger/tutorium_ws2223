package dev.codescreen;

public class _05_Convert {

    /*
    Aufgabe 05
    ==========
    Gegeben ist eine Methode, welche die gerade
    Zahlen von 0 bis n in ein Array speichert.
    Schreiben Sie diese Methode mit while Schleife um!
    Beispiel ist n = 12, so liefert die Methode {12, 10, 8, 6, 4, 2, 0}
    Beispiel ist n = 9, so liefert die Methode {8, 6, 4, 2, 0}
     */

    public int[] liefereGeradeMitFor(int n){
        int[] result = new int[n/2 + 1];
        int j = 0;
        for(int i=n; i>=0; i--){
            if(i%2 == 0) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }


    // Schreiben Sie die Methode oben mit der while Schleife um!
    public int[] liefereGeradeMitWhile(int n){
    	int[] result = new int[n/2 + 1];
        int j = 0;
    	while(n>-1) {
        	if(n%2 == 0) {
                result[j] = n;
                j++;
            }
        	n--;
        }
    	return result;  // Ersetzen Sie diese Zeile mit Ihrem Code!
    }
}
