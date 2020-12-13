package models.Query;

public class QuerysS {
    /**
     * En egen klasse som lagrer alt av Querys for Senior
     * Alle metodene brukes i klassen tools.repository.SearchRepo
     * Alle metodene sorteres etter årstall resultatet ble tatt
     * Queryene matcher bruker id fra bruker tabellen med bruker id i s_resultat tabellen
     * i databasen
     */
    public QuerysS() {

    }

    /**
     * Query som henter ut alle resultat for en utøver
     * @param query
     * @return
     */
    public static String alleResultat(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 1 ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn
     * @param query
     * @return
     */
    public static String søkFornavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på alle parametre
     * @param query
     * @return
     */
    public static String søkAlleParam(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND s_resultat.periode = ? AND bruker.kjønn = ? AND s_resultat.år = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn
     * @param query
     * @return
     */
    public static String søkEtternavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.etternavn = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på periode
     * @param query
     * @return
     */
    public static String søkPeriode(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND s_resultat.periode = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på kjønn
     * @param query
     * @return
     */
    public static String søkKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på årstall
     * @param query
     * @return
     */
    public static String søkÅr(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND s_resultat.år = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn og etternavn
     * @param query
     * @return
     */
    public static String søkFornavnEtternavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn og kjønn
     * @param query
     * @return
     */
    public static String søkEtternavnKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.s_resultat, ro.roklubb WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY s_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på klubbnavn
     * @param query
     * @return
     */
    public static String søkKlubb(String query){
        query = ("SELECT roklubb.klubbnavn, roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.s_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id and bruker.bruker_id = s_resultat.bruker_id AND roklubb.klubbnavn = ? Order By s_resultat.år");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn, etternav og klubbnavn
     * @param query
     * @return
     */
    public static String søkTreParam(String query){
        query = ("SELECT roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.s_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id and bruker.bruker_id = s_resultat.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ?  AND roklubb.klubbnavn = ? Order By s_resultat.år");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på klubb og kjønn
     * @param query
     * @return
     */
    public static String søkKlubbKjønn(String query){
        query = ("SELECT roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.s_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id and bruker.bruker_id = s_resultat.bruker_id AND bruker.kjønn= ? AND roklubb.klubbnavn = ? Order By s_resultat.år");
        return query;
    }


}
