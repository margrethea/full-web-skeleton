package models.øvelse;

public class ØvelseCModell {
    private int testperiode;
    private int brukerid;
    private String seksti;
    private String beveglighet;
    private String tretusen;
    private String kroppshev;
    private String sargeant;

    public ØvelseCModell(int testperiode, int brukerid, String seksti, String beveglighet, String kroppshev, String sargeant, String tretusen){
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.kroppshev = kroppshev;
        this.sargeant = sargeant;
        this.tretusen = tretusen;
        this.brukerid = brukerid;
        this.testperiode = testperiode;
    }

    /** GETTERS OG SETTERS*/

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

    public String getTretusen() {
        return tretusen;
    }

    public void setTretusen(String tretusen) {
        this.tretusen = tretusen;
    }

    public String getSargeant() {
        return sargeant;
    }

    public void setSargeant(String sargeant) {
        this.sargeant = sargeant;
    }

    public int getBrukerid() { return brukerid; }

    public void setBrukerid(int brukerid) { this.brukerid = brukerid; }

    public int getTestperiode() { return testperiode; }

    public void setTestperiode(int testperiode) { this.testperiode = testperiode; }
}
