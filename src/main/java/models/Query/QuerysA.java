package models.Query;

public class QuerysA {
    /**
     * En egen klasse som lagrer alt av Querys for Senior
     * Alle metodene Brukes i tools.repository.SearchRepo_A
     * Alle Querys Sorteres etter år
     * Metodene matcher bruker_id fra bruker tabellen med bruker id i A_resultat tabellen
     * i databasen
     */
    public QuerysA() {

    }

    /**
     * Query som henter ut alle resultat for en utøver, og matcher det med bruker_id
     * @param query
     * @return
     */
    public static String alleResultat(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat, ro.roklubb WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 2 ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn
     * @param query
     * @return
     */
    public static String søkFornavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på alle parametre
     * @param query
     * @return
     */
    public static String søkAlleParam(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND a_resultat.periode = ? AND bruker.kjønn = ? AND a_resultat.år = ? AND roklubb.klubbnavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn
     * @param query
     * @return
     */
    public static String søkEtternavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på periode
     * @param query
     * @return
     */
    public static String søkPeriode(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND a_resultat.periode = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på Kjønn
     * @param query
     * @return
     */
    public static String søkKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på årstall
     * @param query
     * @return
     */
    public static String søkÅr(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND a_resultat.år = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på roklubb
     * @param query
     * @return
     */
    public static  String søkKlubb(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id=a_resultat.bruker_id AND roklubb.klubbnavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn og etternavn
     * @param query
     * @return
     */
    public static String søkFornavnEtternavn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn og kjønn
     * @param query
     * @return
     */
    public static String søkEtternavnKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND a_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på kjønn og Roklubb
     * @param query
     * @return
     */
    public static String søkKlubbKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id=a_resultat.bruker_id AND bruker.kjønn = ? AND roklubb.klubbnavn = ? ORDER BY a_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn, etternavn og klubbnavn
     * @param query
     * @return
     */
    public static String søkTreParam(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.a_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id=a_resultat.bruker_id AND bruker.fornavn= ? AND bruker.etternavn = ? AND roklubb.klubbnavn = ? ORDER BY a_resultat.år;");
        return query;
    }

}
