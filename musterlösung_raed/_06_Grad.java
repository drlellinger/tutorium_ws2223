package dev.codescreen;

public class _06_Grad {

    /*
     Schreibe Sie eine Methode mit einer int Zahl als Argument.
     * ist die Zahl gleich 1, dann liefert die Methode "sehr gut"
     * ist die Zahl gleich 2, dann liefert die Methode "gut"
     * ist die Zahl gleich 3, dann liefert die Methode "befriedigend"
     * ist die Zahl gleich 4, dann liefert die Methode "ausreichend"
     * ist die Zahl gleich 5, dann liefert die Methode "nicht bestanden"
     * bei allen anderen Zahlen liefert die Methode: "unbekannt".
     * Nutzen Sie dafür nur switch - case
     */

    public String evaluate(int n){
    	String note;
    	switch (n) {
    	case 1:
    		note = "sehr gut";
    		break;
    	case 2:
    		note = "gut";
    		break;
    	case 3:
    		note = "befriedigend";
    		break;
    	case 4:
    		note = "ausreichend";
    		break;
    	case 5:
    		note = "nicht bestanden";
    		break;
    	default:
    		note = "unbekannt";
    		break;
    	}
        return note;  // Diese Zeile wird durch Ihren Code ersetzt
    }

}
