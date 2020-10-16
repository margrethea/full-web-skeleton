package models;

public class ØvelseJAmodell {
    private String forNavn;
    private String etterNavn;
    private String seksti;
    private String beveglighet;
    private String femtusenW;
    private String femtusenT;
    private String totusenW;
    private String totusenT;
    private String liggendeRoingW;
    private String liggendeRoingKG;
    private String sargeant;

    public ØvelseJAmodell(String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingW, String liggendeRoingKg, String sargeant) {
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.femtusenT = femtusenW;
        this.femtusenW = femtusenT;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
        this.liggendeRoingW = liggendeRoingW;
        this.liggendeRoingKG = liggendeRoingKg;
        this.sargeant = sargeant;

    }

    public String getSeksti() {
        return seksti;
    }

    public String getBeveglighet() {
        return beveglighet;
    }

    public String getFemtusenT() {

        return femtusenT;
    }

    public String getFemtusenW() {
        return femtusenW;
    }

    public String gettotusenW() {

        return totusenW;
    }

    public String gettotusenT() {

        return totusenT;
    }

    public String getLiggendeRoingW() {

        return liggendeRoingW;
    }

    public String getLiggendeRoingKG() {

        return liggendeRoingKG;
    }

    public String getSargeant() {

        return sargeant;
    }

}
