package dev.codescreen;

public class _02_Sum {

    /*
    Aufgabe 02
    ==========
    Schreiben Sie eine Methode, welche eine int Zahl n
    als Argument hat und folgendes tut:
    Die Methode addiert dann alle Zahlen von 1 bis n
    und liefert das Ergebnis zurück!

    z.b. ist n = 3, dann liefert die Methode 6 zurück (1+2+3)
    z.b. ist n = 5, dann liefert die Methode 15 zurück (1+2+3+4+5)

     */

    public int calculate(int n){
        int sum=0;
    	for(int i=1;i<=n;i++)    	
        {
        	sum+=i;
        }
        return sum;
    }
}
