package tools.repository;

import models.BrukerModell;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BrukerRepository {
    /**
     * legger til bruker til databasen.
     * Denne er ikke implementert. Her må dere gjerne prøve å lage en egen servlet som kan kommunisere med
     * denne metoden.
     *
     * @param resultat bruker objekt som inneholder all informasjon om personen.
     *                 Tips: Objektet må instansieres i en servlet før man kaller på addUser().
     * @param p        printwriter for å skrive ut html i servlet. F.eks SQL feilmeldinger eller annen info.
     **/

    public static void regResultatBruker(BrukerModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultatBruker = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.bruker (fornavn, etternavn, epost, fødselsår, kjønn, roklubb) values (?,?,?,?,?,?)";

            regNyttResultatBruker = db.prepareStatement(query);
            regNyttResultatBruker.setString(1, resultat.getFornavn());
            regNyttResultatBruker.setString(2, resultat.getEtternavn());
            regNyttResultatBruker.setString(3, resultat.getEpost());
            regNyttResultatBruker.setString(4, resultat.getFødselsår());
            regNyttResultatBruker.setString(5, resultat.getKjønn());
            regNyttResultatBruker.setString(6, resultat.getRoklubb());
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