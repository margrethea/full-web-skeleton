package tools.repository;

import models.bruker.BrukerModell;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrukerRepository {
    /**
     * legger til bruker til databasen.
     *
     * @param resultat bruker objekt som inneholder all informasjon om personen.
     * @param p        printwriter for å skrive ut html i servlet. F.eks SQL feilmeldinger eller annen info.
     **/

    public static void regResultatBruker(BrukerModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultatBruker = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.bruker (bruker.fornavn, bruker.etternavn, bruker.epost, bruker.fødselsår, bruker.kjønn, bruker.roklubb_id, bruker.klasse_id) values (?,?,?,?,?,?,?)";

            regNyttResultatBruker = db.prepareStatement(query);
            regNyttResultatBruker.setString(1, resultat.getFornavn());
            regNyttResultatBruker.setString(2, resultat.getEtternavn());
            regNyttResultatBruker.setString(3, resultat.getEpost());
            regNyttResultatBruker.setString(4, resultat.getFødselsår());
            regNyttResultatBruker.setString(5, resultat.getKjønn());
            regNyttResultatBruker.setInt(6, resultat.getRoklubb());
            regNyttResultatBruker.setInt(7, resultat.getKlasseid());
            regNyttResultatBruker.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                db.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}