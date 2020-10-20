package models;

public class ØvelseBModell {
    private String forNavn;
    private String etterNavn;
    private String seksti;
    private String beveglighet;
    private String tretusen;
    private String totusenW;
    private String totusenT;
    private String kroppshev;
    private String sargeant;

    public ØvelseBModell(String seksti, String beveglighet, String tretusen, String totusenW, String totusenT, String kroppshev, String sargeant) {
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.kroppshev = kroppshev;
        this.sargeant = sargeant;
        this.tretusen = tretusen;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
    }

    public String getForNavn() { return forNavn;}

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEtterNavn() { return etterNavn;}

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public String getSeksti() {
        return seksti;
    }

    public void setSeksti(String seksti) {
        this.seksti = seksti;
    }

    public String getBeveglighet() {
        return beveglighet;
    }

    public void setBeveglighet(String beveglighet) {
        this.beveglighet = beveglighet;
    }

    public String getKroppshev() {
        return kroppshev;
    }

    public void setKroppshev(String kroppshev) {
        this.kroppshev = kroppshev;
    }

    public String getSargeant() {
        return sargeant;
    }

    public void setSargeant(String sargeant) {
        this.sargeant = sargeant;
    }

    public String getTretusen() {
        return tretusen;
    }

    public void setTretusen(String tretusen) {
        this.tretusen = tretusen;
    }

    public String getTotusenW() {
        return totusenW;
    }

    public void setTotusenW(String totusenW) {
        this.totusenW = totusenW;
    }

    public String getTotusenT() {
        return totusenT;
    }

    public void setTotusenT(String totusenT) {
        this. totusenT = totusenT;
    }
}

