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

    public ØvelseSmodell(String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingP, String liggendeRoingKg, String knebøyKG, String knebøyP) {
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

    public void setSeksti(String seksti) {
        this.seksti = seksti;
    }

    public String getBeveglighet() {
        return beveglighet;
    }

    public void setBeveglighet(String beveglighet) {
        this.beveglighet = beveglighet;
    }

    public String getFemtusenT() {
        return femtusenT;
    }

    public void setFemtusenT(String femtusenT) {
        this.femtusenT = femtusenT;
    }

    public String getFemtusenW() {
        return femtusenW;
    }


    public void setFemtusenW(String femtusenW) {
        this.femtusenW = femtusenW;
    }

    public String gettotusenW() {
        return totusenW;
    }

    public void setTotusenW(String totusenW) {
        this.totusenW = totusenW;
    }

    public String gettotusenT() {
        return totusenT;
    }

    public void setTotusenT(String totusenT) {
        this.totusenT = totusenT;
    }

    public String getLiggendeRoingW() {
        return liggendeRoingW;
    }

    public void setLiggendeRoingW(String liggendeRoingW) {
        this.liggendeRoingW = liggendeRoingW;
    }

    public String getLiggendeRoingKG() {
        return liggendeRoingKG;
    }

    public void setLiggendeRoingKG(String liggendeRoingKG) {
        this.liggendeRoingKG = liggendeRoingKG;
    }

    public String getKnebøyKG() {
        return knebøyKG;
    }

    public void setKnebøyKG(String knebøyKG) {
        this.knebøyKG = knebøyKG;
    }

    public String getKnebøyP() {
        return knebøyP;
    }

    public void setKnebøyP(String knebøyP) {
        this.knebøyP = knebøyP;
    }
}

