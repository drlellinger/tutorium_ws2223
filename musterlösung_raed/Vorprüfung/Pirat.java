package dev.codescreen;

public class Pirat {

    /*
    * Der Legende nach wurde die Beute bei Piratenbanden
    * gerecht durch alle Piraten geteilt.
    * Falls sich die Beute sich nicht gerecht aufteilen
    * ließ erhielt der Kapitän den überschüssigen Anteil.
    * Wie viele Golddublonen erhält der Kapitän extra?
    * Implementieren Sie die folgende Methode, welche
    * diese Frage beantworten kann!
    */

    public int getExtra(int golddublonen, int piraten){
    	int r=golddublonen%piraten;
        return r;
    }

}
