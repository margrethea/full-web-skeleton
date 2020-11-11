package models.Query;

public class QuerysB {
    /**
     * En egen klasse som lagrer alt av Querys for Junior B
     */
    public QuerysB() {

    }
    // Query som henter ut alle resultat for en utøver, og matcher det med bruker_id
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String alleResultatB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 3 ORDER BY b_resultat.år;");

        return query;
    }
    // Query som henter ut resultat etter søking på fornavn
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String søkFornavnB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? ORDER BY b_resultat.år;");

        return query;

    }
    // Query som henter ut resultat etter søking på alle parametre
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String søkAlleParamB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND b_resultat.periode = ? AND bruker.kjønn = ? AND b_resultat.år = ? ORDER BY b_resultat.år;");

        return query;
    }
    // Query som henter ut resultat etter søking på etternavn
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String søkEtternavnB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }
    // Query som henter ut resultat etter søking på periode
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String søkPeriodeB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND b_resultat.periode = ? ORDER BY b_resultat.år;");
        return query;
    }
    // Query som henter ut resultat etter søking på kjønn
    //Sorteres etter år
    //Brukes i klassen SearchRepoB
    public static String søkKjønnB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? ORDER BY b_resultat.år;");

        return query;
    }
    public static String søkÅrB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND b_resultat.år = ? ORDER BY b_resultat.år;");
        return query;
    }
    public static String søkFornavnEtternavnB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }
    public static String søkEtternavnKjønnB(String query){
        query = ("select bruker.fornavn, bruker.etternavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore, bruker.klasse_id FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id = bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY b_resultat.år;");
        return query;
    }

}