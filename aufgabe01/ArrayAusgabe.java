package aufgabe01;

public class ArrayAusgabe {

	public static void main(String[] args) {
		
		//Deklarierung, Initialisierung Array und Wertezuweisung 
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		//Ausgabe über for-Schleife:
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
