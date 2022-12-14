package dev.codescreen;

public class Operation {

    // 1) Die Methode addNat addiert zwei positive natürliche Zahlen
    // 2) Falls eine der beiden Zahlen negativ sein sollte, dann liefert die Methode -1
    // 3) Falls beide Zahlen negativ sind, dann liefert die Methode -2
    // Implementieren Sie die addNat gemäß Anforderung 1 bis 3.

	public int addNat(int x, int y){
        int a;
        if(x<0&&y<0){
            a = -2;
        }
        else if(x<0||y<0){
            a = -1;
        }
        else{
            a = x + y;
        }
        return a;
    }


    // Die Methode isTeilbar überprüft of eine int zahl
    // durch 2 und durch 3 Oder durch 5 ohne Rest teilbar ist.
    // Ist dies der Fall, dann liefert die Methode true
    // Beispiel: 6 ist durch 2 und durch 3 ohne Rest teilbar!
    //  Implementieren Sie die isTeilbar Methode

    public boolean isTeilbar(int zahl){
        boolean b;
        if(((zahl%2)==0)||((zahl%3)==0)||((zahl%5)==0)){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }

    // Die Methode verarbeiteN
    // überprüft, ob das Quadrat von n kleiner oder gleich max ist
    // Ist dies der Fall, dann liefert die Methode das Quadrat von n zurück!
    // Falls das Quadrat von n großer als max ist, dann liefert sie max zurück!
    // Implementieren Sie die verdoppele Methode

    public int verarbeiteN(int n, int max){
        int q = n*n;
        int r;
        if (q>max){
            r = max;
        }
        else{
            r = q;
        }
        return r;
    }
}
