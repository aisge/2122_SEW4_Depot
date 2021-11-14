package at.htl.depot.model;

// TODO Position in Entity umwandeln!

import java.time.LocalDate;

public class Position {

    private int id;

    private int anzahl;

    private float kaufKurs;

    private LocalDate kaufDatum;

    // TODO Verknüpfung zu Depot und Wertpapier herstellen


    //<editor-fold desc="// Getter and Setter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public float getKaufKurs() {
        return kaufKurs;
    }

    public void setKaufKurs(float kaufKurs) {
        this.kaufKurs = kaufKurs;
    }

    public LocalDate getKaufDatum() {
        return kaufDatum;
    }

    public void setKaufDatum(LocalDate kaufDatum) {
        this.kaufDatum = kaufDatum;
    }
    //</editor-fold>

}
