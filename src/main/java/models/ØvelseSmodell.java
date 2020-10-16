package models;

public class ØvelseSmodell {
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
    private String knebøyKG;
    private String knebøyP;

    public ØvelseSmodell(String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingW, String liggendeRoingKg, String knebøyKG, String knebøyP) {
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
        this.knebøyKG = knebøyKG;
        this.knebøyP = knebøyP;
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

    public String getKnebøyKG() {
        return knebøyKG;
    }

    public String getKnebøyP() {
        return knebøyP;
    }
}

