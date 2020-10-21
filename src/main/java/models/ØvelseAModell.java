package models;

public class ØvelseAModell {
    private String seksti;
    private String beveglighet;
    private String femtusenW;
    private String femtusenT;
    private String totusenW;
    private String totusenT;
    private String liggendeRoingKG;
    private String liggendeRoingP;
    private String sargeant;

    public ØvelseAModell(String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingP, String liggendeRoingKg, String sargeant) {
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.femtusenT = femtusenW;
        this.femtusenW = femtusenT;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
        this.liggendeRoingKG = liggendeRoingKg;
        this.liggendeRoingP = liggendeRoingP;
        this.sargeant = sargeant;

    }

    /** Getters og setters*/

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

    public String getFemtusenW() {
        return femtusenW;
    }

    public void setFemtusenW(String femtusenW) {
        this.femtusenW = femtusenW;
    }

    public String getFemtusenT() {
        return femtusenT;
    }

    public void setFemtusenT(String femtusenT) {
        this.femtusenT = femtusenT;
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
        this.totusenT = totusenT;
    }

    public String getLiggendeRoingKG() {
        return liggendeRoingKG;
    }

    public void setLiggendeRoingKG(String liggendeRoingKG) {
        this.liggendeRoingKG = liggendeRoingKG;
    }
    public String getLiggendeRoingP() {
        return liggendeRoingP;
    }

    public void setLiggendeRoingP(String liggendeRoingP) {
        this.liggendeRoingP = liggendeRoingP;
    }

    public String getSargeant() {
        return sargeant;
    }

    public void setSargeant(String sargeant) {
        this.sargeant = sargeant;
    }
}
