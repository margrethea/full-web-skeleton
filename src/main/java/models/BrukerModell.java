package models;

public class BrukerModell {
    private String fornavn;
    private String etternavn;
    private String epost;
    private String fødselsår;
    private String kjønn;
    private String roklubb;

    public BrukerModell(String fornavn, String etternavn, String epost, String fødselsår, String kjønn, String roklubb) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.epost = epost;
        this.fødselsår = fødselsår;
        this.kjønn = kjønn;
        this.roklubb = roklubb;
    }

    /** Getters og setters*/

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getFødselsår() {
        return fødselsår;
    }

    public void setFødselsår(String fødselsår) {
        this.fødselsår = fødselsår;
    }

    public String getKjønn() {
        return kjønn;
    }

    public void setKjønn(String kjønn) {
        this.kjønn = kjønn;
    }

    public String getRoklubb() {
        return roklubb;
    }

    public void setRoklubb(String roklubb) {
        this.roklubb = roklubb;
    }
}
