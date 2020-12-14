package models.Query;

public class QuerysB {
    /**
     * En egen klasse som lagrer alt av Querys for Junior B
     * Alle Metodene Brukes i tools.repository.SearchRepoB
     * Alle metodene Sorteres etter år.
     * Metodene matcher bruker_id fra bruker tabellen med bruker id i b_resultat tabellen
     * i databasen
     */
    public QuerysB() {

    }

    /**
     * Query som henter ut alle resultat for en utøver uten å spesifisere noe søkefelt.
     * @param query
     * @return
     */
    public static String alleResultatB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 3 ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn
     * @param query
     * @return
     */
    public static String søkFornavnB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på alle parametre
     * @param query
     * @return
     */
    public static String søkAlleParamB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND b_resultat.periode = ? AND bruker.kjønn = ? AND b_resultat.år = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn
     * @param query
     * @return
     */
    public static String søkEtternavnB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på periode
     * @param query
     * @return
     */
    public static String søkPeriodeB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND b_resultat.periode = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på kjønn
     * @param query
     * @return
     */
    public static String søkKjønnB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på år
     * @param query
     * @return
     */
    public static String søkÅrB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND b_resultat.år = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på roklubb
     * @param query
     * @return
     */
    public static String søkKlubb(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id = b_resultat.bruker_id AND roklubb.klubbnavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn og etternavn
     * @param query
     * @return
     */
    public static String søkFornavnEtternavnB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på etternavn og kjønn
     * @param query
     * @return
     */
    public static String søkEtternavnKjønnB(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb.id = roklubb.roklubb_id AND b_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på kjønn og roklubb
     * @param query
     * @return
     */
    public static String søkKlubbKjønn(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id = b_resultat.bruker_id AND bruker.kjønn = ? AND roklubb.klubbnavn = ? ORDER BY b_resultat.år;");
        return query;
    }

    /**
     * Query som henter ut resultat etter søking på fornavn, etternavn og roklubb
     * @param query
     * @return
     */
    public static String søkTreParam(String query){
        query = ("select roklubb.klubbnavn, bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.roklubb, ro.b_resultat WHERE bruker.roklubb_id = roklubb.roklubb_id AND bruker.bruker_id = b_resultat.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND roklubb.klubbnavn = ? ORDER BY b_resultat.år;");
        return query;
    }

}