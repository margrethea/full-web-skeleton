package models.øvelse;

public class ØvelseBModell {
    private int testperiode;
    private int brukerid;
    private String seksti;
    private String beveglighet;
    private String tretusen;
    private String totusenW;
    private String totusenT;
    private String kroppshev;
    private String sargeant;

    public ØvelseBModell(int testperiode, int brukerid, String seksti, String beveglighet, String tretusen, String totusenW, String totusenT, String kroppshev, String sargeant) {
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.tretusen = tretusen;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
        this.kroppshev = kroppshev;
        this.sargeant = sargeant;
        this.brukerid = brukerid;
        this.testperiode = testperiode;
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

    public int getBrukerid() { return brukerid; }

    public void setBrukerid(int brukerid) { this.brukerid = brukerid; }

    public int getTestperiode() { return testperiode; }

    public void setTestperiode(int testperiode) { this.testperiode = testperiode; }
}

