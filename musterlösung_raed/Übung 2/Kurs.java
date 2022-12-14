package dev.codescreen;

public class Kurs {

    private String[] teilnehmer;

    public void setTeilnehmer(String[] teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    // Die Methode contain überprüft, ob eine bestimmte Person
    // als Teilnehmer bei dem Kurs dabei ist oder nicht!
    // Tipp: String Vergleich :  a.equals(b)
    // Implementieren Sie die Methode contain
    public boolean contain(String personName){
        boolean r=false;
        for(int i=0;i<teilnehmer.length;i++) {
        	if (personName.equals(teilnehmer[i])){
                r=true;
            }
        }
        return r;
    }
}
