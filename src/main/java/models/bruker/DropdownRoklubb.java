package models.bruker;

/**
 * Modell som henter klubbnavn, sjekkket med roklubb_id
 * Brukes for å lage en Dropdown for klubber
 */
public class DropdownRoklubb {
    private String roklubb_id;
    private String klubbnavn;

    /**
     * Constructor for DropdownRoklubb
     * @param roklubb_id
     * @param klubbnavn
     */
    public DropdownRoklubb(String roklubb_id, String klubbnavn) {
        //super();
        this.roklubb_id= roklubb_id;
        this.klubbnavn = klubbnavn;

    }

    public String getRoklubb_id() {

        return roklubb_id;
    }

    public void setRoklubb_id(String roklubb_id) {

        this.roklubb_id = roklubb_id;
    }

    public String getKlubbnavn() {

        return klubbnavn;
    }

    public void setKlubbnavn(String klubbnavn) {

        this.klubbnavn = klubbnavn;
    }

}