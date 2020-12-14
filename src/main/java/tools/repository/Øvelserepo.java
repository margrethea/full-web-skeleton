package tools.repository;

import models.øvelse.ØvelseAModell;
import models.øvelse.ØvelseBModell;
import models.øvelse.ØvelseCModell;
import models.øvelse.ØvelseSmodell;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Øvelserepo {
    /**
     * legger til resultater til databasen.

     * @param resultat bruker objekt som inneholder all informasjon om øvelsene.
     *
     * @param p        printwriter for å skrive ut html i servlet. F.eks SQL feilmeldinger eller annen info.
     **/

    public static void regResultatJC(ØvelseCModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultat = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.c_resultat (60w, bevegelighet, 3000m, kroppshev, sargeant, bruker_id, periode, år) VALUES (?,?,?,?,?,?,?,2020)";

            regNyttResultat = db.prepareStatement(query);
            regNyttResultat.setString(1, resultat.getSeksti());
            regNyttResultat.setString(2, resultat.getBeveglighet());
            regNyttResultat.setString(3, resultat.getTretusen());
            regNyttResultat.setString(4, resultat.getKroppshev());
            regNyttResultat.setString(5, resultat.getSargeant());
            regNyttResultat.setInt(6, resultat.getBrukerid());
            regNyttResultat.setInt(7, resultat.getTestperiode());
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

    public static void regResultatS(ØvelseSmodell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultatS = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.s_resultat (60w, bevegelighet, 5000w, 5000t, 2000w, 2000t, ligg_ro_p, ligg_ro_kg, knebøy_p, knebøy_kg, bruker_id, periode, år) values (?,?,?,?,?,?,?,?,?,?,?,?,2020)";

            regNyttResultatS = db.prepareStatement(query);
            regNyttResultatS.setString(1, resultat.getSeksti());
            regNyttResultatS.setString(2, resultat.getBeveglighet());
            regNyttResultatS.setString(3, resultat.getFemtusenW());
            regNyttResultatS.setString(4, resultat.getFemtusenT());
            regNyttResultatS.setString(5, resultat.gettotusenW());
            regNyttResultatS.setString(6, resultat.gettotusenT());
            regNyttResultatS.setString(7, resultat.getLiggendeRoingP());
            regNyttResultatS.setString(8, resultat.getLiggendeRoingKG());
            regNyttResultatS.setString(9, resultat.getKnebøyP());
            regNyttResultatS.setString(10, resultat.getKnebøyKG());
            regNyttResultatS.setInt(11, resultat.getBrukerid());
            regNyttResultatS.setInt(12, resultat.getTestperiode());
            regNyttResultatS.execute();

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

    public static void regResultatB(ØvelseBModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultatB = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.b_resultat (60w, bevegelighet, 3000m, 2000w, 2000t, kroppshev, sargeant, bruker_id, periode, år) values (?,?,?,?,?,?,?,?,?,2020)";

            regNyttResultatB = db.prepareStatement(query);
            regNyttResultatB.setString(1, resultat.getSeksti());
            regNyttResultatB.setString(2, resultat.getBeveglighet());
            regNyttResultatB.setString(3, resultat.getTretusen());
            regNyttResultatB.setString(4, resultat.getTotusenW());
            regNyttResultatB.setString(5, resultat.getTotusenT());
            regNyttResultatB.setString(6, resultat.getKroppshev());
            regNyttResultatB.setString(7, resultat.getSargeant());
            regNyttResultatB.setInt(8, resultat.getBrukerid());
            regNyttResultatB.setInt(9, resultat.getTestperiode());
            regNyttResultatB.execute();

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

    public static void regResultatA(ØvelseAModell resultat, PrintWriter p) {
        Connection db = null;
        PreparedStatement regNyttResultatA = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO ro.a_resultat (60w, bevegelighet, 5000w, 5000t, 2000w, 2000t, ligg_ro_p, ligg_ro_kg, sargeant, bruker_id, periode, år) values (?,?,?,?,?,?,?,?,?,?,?,2020)";

            regNyttResultatA = db.prepareStatement(query);
            regNyttResultatA.setString(1, resultat.getSeksti());
            regNyttResultatA.setString(2, resultat.getBeveglighet());
            regNyttResultatA.setString(3, resultat.getFemtusenW());
            regNyttResultatA.setString(4, resultat.getFemtusenT());
            regNyttResultatA.setString(5, resultat.getTotusenW());
            regNyttResultatA.setString(6, resultat.getTotusenT());
            regNyttResultatA.setString(7, resultat.getLiggendeRoingP());
            regNyttResultatA.setString(8, resultat.getLiggendeRoingKG());
            regNyttResultatA.setString(9, resultat.getSargeant());
            regNyttResultatA.setInt(10, resultat.getBrukerid());
            regNyttResultatA.setInt(11, resultat.getTestperiode());
            regNyttResultatA.execute();

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

