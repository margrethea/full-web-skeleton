package models.øvelse;


/**
 * Modell som representerer øvelsene en utøver skal fullføre i virkeligheten i utøver klassen Junior A
 * Feltene er de ulike kolonene som finnes i databasen
 */
public class ØvelseAModell {
    private int testperiode;
    private int brukerid;
    private String seksti;
    private String beveglighet;
    private String femtusenW;
    private String femtusenT;
    private String totusenW;
    private String totusenT;
    private String liggendeRoingKG;
    private String liggendeRoingP;
    private String sargeant;

    /**
     * Constructor  som brukes når et testresultat skal legges inn i databasen.
     * Metoden blir brukt i servlets.registrering.JuniorA
     * @param testperiode
     * @param brukerid
     * @param seksti
     * @param beveglighet
     * @param femtusenW
     * @param femtusenT
     * @param totusenW
     * @param totusenT
     * @param liggendeRoingKG
     * @param liggendeRoingP
     * @param sargeant
     */
    public ØvelseAModell(int testperiode, int brukerid, String seksti, String beveglighet, String femtusenW, String femtusenT, String totusenW, String totusenT, String liggendeRoingKG, String liggendeRoingP, String sargeant) {
        this.seksti = seksti;
        this.beveglighet = beveglighet;
        this.femtusenT = femtusenW;
        this.femtusenW = femtusenT;
        this.totusenW = totusenW;
        this.totusenT = totusenT;
        this.liggendeRoingKG = liggendeRoingKG;
        this.liggendeRoingP = liggendeRoingP;
        this.sargeant = sargeant;
        this.brukerid = brukerid;
        this.testperiode = testperiode;

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

    public int getBrukerid() { return brukerid; }

    public void setBrukerid(int brukerid) { this.brukerid = brukerid; }

    public int getTestperiode() { return testperiode; }

    public void setTestperiode(int testperiode) { this.testperiode = testperiode; }
}
