package models.øvelse;

public class ØvelseSmodell {
    private int testperiode;
   // private int år;
    private int brukerid;
    private String seksti;
    private String beveglighet;
    private String femtusenW;
    private String femtusenT;
    private String totusenW;
    private String totusenT;
    private String liggendeRoingP;
    private String liggendeRoingKG;
    private String knebøyKG;
    private String knebøyP;

    public ØvelseSmodell(int testperiode, int brukerid, String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingP, String liggendeRoingKg, String knebøyKG, String knebøyP) {
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.femtusenT = femtusenW;
        this.femtusenW = femtusenT;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
        this.liggendeRoingP = liggendeRoingP;
        this.liggendeRoingKG = liggendeRoingKg;
        this.knebøyKG = knebøyKG;
        this.knebøyP = knebøyP;
        this.brukerid = brukerid;
        this.testperiode = testperiode;
        //this.år = år;
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

    public String getLiggendeRoingP() {
        return liggendeRoingP;
    }

    public void setLiggendeRoingP(String liggendeRoingP) {
        this.liggendeRoingP = liggendeRoingP;
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

    public int getBrukerid() { return brukerid; }

    public void setBrukerid(int brukerid) { this.brukerid = brukerid; }

    public int getTestperiode() { return testperiode; }

    public void setTestperiode(int testperiode) { this.testperiode = testperiode; }

   // public int getÅr() { return år; }

   // public void setÅr(int år) { this.år = år; }
}

