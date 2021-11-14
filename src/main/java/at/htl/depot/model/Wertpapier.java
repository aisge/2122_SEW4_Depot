package at.htl.depot.model;

// TODO Wertpapier in Entity umwandeln!

public class Wertpapier {

    private String wkn;

    private String bezeichnung;

    private float kurs;

    public Wertpapier(String wkn, String bezeichnung, float kurs) {
        this.wkn = wkn;
        this.bezeichnung = bezeichnung;
        this.kurs = kurs;
    }

    //<editor-fold desc="// Getter and Setter">
    public String getWkn() {
        return wkn;
    }

    public void setWkn(String wkn) {
        this.wkn = wkn;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public float getKurs() {
        return kurs;
    }

    public void setKurs(float kurs) {
        this.kurs = kurs;
    }
    //</editor-fold>
}
