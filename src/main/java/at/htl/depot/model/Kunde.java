package at.htl.depot.model;

// TODO Kunde in Entity umwandeln!

public class Kunde {

    private int kundenNr;

    private String vorname;

    private String nachname;

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }


    //<editor-fold desc="// Getter and Setter">
    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    //</editor-fold>
}
