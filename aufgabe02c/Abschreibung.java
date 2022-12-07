package aufgabe02c;

import java.util.Scanner;

public class Abschreibung {

	public static void main(String[] args) {
			//deklaration und init der Variablen und Objekte:
			Scanner in = new Scanner(System.in);
			LineareAbschreibung la = new LineareAbschreibung();
			System.out.println("Wie hoch ist der Anschaffungswert?");
			double a  = in.nextDouble();
			System.out.println("Wie lange ist die Nutzungsdauer in Jahren?");
			int n  = in.nextInt();
			
			la.linearAbschreiben(n, a);
			
			in.close();
			
			
	}

}
