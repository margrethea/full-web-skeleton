package models.bruker;

/**
 * Modell som henter fornavn og etternavn fra brukeren, sjekkket med BrukerId
 * Brukes for å lage en Dropdown
 */
public class DropdownBruker {
    private String bruker_id;
    private String forNavn;
    private String etterNavn;


    public DropdownBruker(String bruker_id, String forNavn, String etterNavn) {
        super();
        this.bruker_id= bruker_id;
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;

    }

    public String getBruker_id() {

        return bruker_id;
    }

    public void setBruker_id(String bruker_id) {

        this.bruker_id = bruker_id;
    }

    public String getForNavn() {

        return forNavn;
    }

    public void setForNavn(String forNavn) {

        this.forNavn = forNavn;
    }

    public String getEtterNavn() {

        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }
}