package tools.repository;

import models.ØvelseCModell;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Øvelserepo {
    /**
     * legger til bruker til databasen.
     * Denne er ikke implementert. Her må dere gjerne prøve å lage en egen servlet som kan kommunisere med
     * denne metoden.
     *
     * @param resultat bruker objekt som inneholder all informasjon om personen.
     *                 Tips: Objektet må instansieres i en servlet før man kaller på addUser().
     * @param p        printwriter for å skrive ut html i servlet. F.eks SQL feilmeldinger eller annen info.
    **/

    public static void regResultatJC(ØvelseCModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultat = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.resultat (60w, bevegelighet, 3000t, kroppshev, sargeant ) values (?,?,?,?,?)";

            regNyttResultat = db.prepareStatement(query);
            regNyttResultat.setString(1, resultat.getSeksti());
            regNyttResultat.setString(2, resultat.getBeveglighet());
            regNyttResultat.setString(3, resultat.getTretusen());
            regNyttResultat.setString(4, resultat.getKroppshev());
            regNyttResultat.setString(5, resultat.getSargeant());
            regNyttResultat.execute();

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

