package models.Query;

import java.sql.PreparedStatement;

public class QuerysC {
    /**
     * En egen klasse som lagrer alt av Querys for Junior C
     */

    public QuerysC() {

    }

    // Query som henter ut alle resultat for en utøver, og matcher det med bruker_id
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String alleResultatC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 4 ORDER BY c_resultat.år;");

        return query;
    }

    // Query som henter ut resultat etter søking på fornavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkFornavnC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? ORDER BY c_resultat.år;");

        return query;

    }

    // Query som henter ut resultat etter søking på alle parametre
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkAlleParamC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND c_resultat.periode = ? AND bruker.kjønn = ? AND c_resultat.år = ? ORDER BY c_resultat.år;");

        return query;
    }

    // Query som henter ut resultat etter søking på etternavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkEtternavnC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    // Query som henter ut resultat etter søking på periode
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkPeriodeC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND c_resultat.periode = ? ORDER BY c_resultat.år;");
        return query;
    }

    // Query som henter ut resultat etter søking på kjønn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkKjønnC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? ORDER BY c_resultat.år;");
        return query;
    }

    public static String søkÅrC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND c_resultat.år = ? ORDER BY c_resultat.år;");
        return query;
    }

    public static String søkFornavnEtternavnC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    public static String søkEtternavnKjønnC(String query) {
        query = ("select bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }
}