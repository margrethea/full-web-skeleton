package models.Query;

public class QuerysC {
    /**
     * En egen klasse som lagrer alt av Querys for Junior C
     * Alle metodene brukes i tools.repository.SearchRepoC
     * Alle metodene sorteres etter år
     * Metodene matcher bruker_id fra bruker tabellen med bruker id i c_resultat tabellen
     * i databasen
     */

    public QuerysC() {

    }

    /**
     * Query som henter ut alle resultat for en utøver uten å spesifisere noe søkefelt.
     * @param query
     * @return
     */
    public static String alleResultatC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 4 ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn
     * @param query
     * @return
     */
    public static String søkFornavnC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på alle parametre
     * @param query
     * @return
     */
    public static String søkAlleParamC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND c_resultat.periode = ? AND bruker.kjønn = ? AND c_resultat.år = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn
     * @param query
     * @return
     */
    public static String søkEtternavnC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på periode
     * @param query
     * @return
     */
    public static String søkPeriodeC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND c_resultat.periode = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på kjønn
     * @param query
     * @return
     */
    public static String søkKjønnC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på årstall
     * @param query
     * @return
     */
    public static String søkÅrC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND c_resultat.år = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på roklubb
     * @param query
     * @return
     */
    public static String søkKlubb(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND roklubb.klubbnavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn og etternavn
     * @param query
     * @return
     */
    public static String søkFornavnEtternavnC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn og kjønn
     * @param query
     * @return
     */
    public static String søkEtternavnKjønnC(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn og kjønn
     * @param query
     * @return
     */
    public static String søkKlubbKjønn(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? AND roklubb.klubbnavn = ? ORDER BY c_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn, etternavn og klubb
     * @param query
     * @return
     */
    public static String søkTreParam(String query) {
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.roklubb, ro.c_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND c_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND roklubb.klubbnavn = ? ORDER BY c_resultat.år;");
        return query;
    }
}