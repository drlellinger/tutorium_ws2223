package dev.codescreen;

public class _07_Student {

    private String name;
    private String study;

    public _07_Student(String name, String study){
        this.name = name;
        this.study = study;
    }


    public String getStudy(){
        return this.study;
    }
    /*
     Studiert die Person Wirtschaftsinformatik,
     dann gibt es die folgende seltsame Regel:

     * Die Person kann ihr Fach nur zu Informatik
     * oder zu Wirtschaft wechseln.
     * versucht die Person das Fach zu etwas anders zu wechseln,
     * dann geschieht einfach nichts!

    Nun die seltsame Regeln gehen weiter!

    * Studiert die Person ein anderes Fach als Wirtschaftsinformatik
    * so kann die Person das Fach beliebig wechseln!
    * Beispiel: von Mathematik zu Physik!

     Implementieren Sie die Methode changeStudy gemäß der Regeln oben!

     */
    

    public void changeStudy(String study){
        if(getStudy().equals("Wirtschaftsinformatik")){
        	if(study.equals("Informatik")) {
        		this.study = "Informatik";
        	}
        	else if(study.equals("Wirtschaft")) {
        		this.study = "Wirtschaft";
        	}
        	else {
        		this.study = "Wirtschaftsinformatik";
        	}
        }
    }




}
