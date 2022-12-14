package dev.codescreen;

public class Buch {

    private String title;
    private double preis;

    private boolean neuAuflage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean isNeuAuflage() {
        return neuAuflage;
    }

    public void setNeuAuflage(boolean neuAuflage) {
        this.neuAuflage = neuAuflage;
    }


    // Die Methode erhoehePreis(int p, double max):
    // Erhöht den Preis um Prozent p (z.B: p = 5 steht für 5%)
    // Falls das Buch eine neue Auflage ist, so wird der Preis um 25 % erhöht
    // Sollte p aber großer als 25% sein, so wird natürlich p genommen!

    // Sollte das Buch keine neue Auflage sein, so wird der Preis um p% erhöht
    // Ist der neue Preis höher als max, so wird der neue Preis auf max gesetzt!

    // Ist der Preis von Anfang an höher als max, dann erhöht die Methode nichts
    // derselbe Preis wird dann geliefert!

    // Implementieren Sie die Methode erhoehePreis(int p, double max)

    public void erhoehePreis(int p, double max){
        if(getPreis()<max){
            if (isNeuAuflage()==true){
                this.preis*=1.25;
            }
            else{
                this.preis=this.preis*(1+((double)p/100));
                if(this.preis>=max){
                    this.preis=max;
                }
            }
        }
        else{
            this.preis=max;
        }

    }




}
