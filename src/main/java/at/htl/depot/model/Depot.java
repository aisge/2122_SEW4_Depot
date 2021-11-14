package at.htl.depot.model;

// TODO Depot in Entity umwandeln!

public class Depot {

    private int depotNr;

    private String bezeichnung;

    // TODO Verknpüfung zum Kunden herstellen


    //<editor-fold desc="// Getter and Setter">
    public int getDepotNr() {
        return depotNr;
    }

    public void setDepotNr(int depotNr) {
        this.depotNr = depotNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    //</editor-fold>
}
