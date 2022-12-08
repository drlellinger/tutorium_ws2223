package dev.codescreen;

public class _04_Choice {

     /*
    Aufgabe 04
    ==========
    Schreiben Sie eine Methode, welche eine int Zahl n
    als Argument hat und folgendes tut:
    * ist die Zahl kleiner als 0, dann liefert die Methode -1
    * ist die Zahl zwischen 0 und 50, dann liefert sie 1
    * ist die Zahl zwischen 51 und 100, dann liefert sie 2
    * ist die Zahl großer als 100, dann liefert sie 3
     */

    public int getResult(int n){
        int r;
    	if (n<0) {
        	r=-1;
        }
    	else if(n<51){
    		r=1;
    	}
    	else if(n<101) {
    		r=2;
    	}
    	else {
    		r=3;
    	}
        return r;
    }
}
