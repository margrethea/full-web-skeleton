package models;

public class ØvelseJBmodell {
    private String forNavn;
    private String etterNavn;
    private String seksti;
    private String beveglighet;
    private String tretusen;
    private String totusenW;
    private String totusenT;
    private String kroppshev;
    private String sargeant;

    public ØvelseJBmodell(String seksti, String beveglighet, String tretusen, String totusenW, String totusenT, String kroppshev, String sargeant) {
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.kroppshev = kroppshev;
        this.sargeant = sargeant;
        this.tretusen = tretusen;
        this.totusenT = totusenT;
        this.totusenW = totusenW;
    }

    public String getSeksti() {
        return seksti;
    }

    public String getBeveglighet() {
        return beveglighet;
    }

    public String getKroppshev() {
        return kroppshev;
    }

    public String getSargeant() {
        return sargeant;
    }

    public String getTretusen() {
        return tretusen;
    }

    public String getTotusenT() {
        return totusenT;
    }

    public String getTotusenW() {
        return totusenW;
    }
}

