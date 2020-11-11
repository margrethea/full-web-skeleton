package models.Query;

public class QuerysA {
    /**
     * En egen klasse som lagrer alt av Querys for Senior
     */
    public QuerysA() {

    }
    // Query som henter ut alle resultat for en utøver, og matcher det med bruker_id
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String alleResultat(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 2 ORDER BY a_resultat.år;");


        return query;
    }
    // Query som henter ut resultat etter søking på fornavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkFornavn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? ORDER BY a_resultat.år;");

        return query;

    }
    // Query som henter ut resultat etter søking på alle parametre
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkAlleParam(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND a_resultat.periode = ? AND bruker.kjønn = ? AND a_resultat.år = ? ORDER BY a_resultat.år;");

        return query;
    }
    // Query som henter ut resultat etter søking på etternavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkEtternavn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }
    // Query som henter ut resultat etter søking på periode
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkPeriode(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND s_resultat.periode = ? ORDER BY a_resultat.år;");
        return query;
    }
    // Query som henter ut resultat etter søking på kjønn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkKjønn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? ORDER BY a_resultat.år;");

        return query;
    }
    public static String søkÅr(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND s_resultat.år = ? ORDER BY a_resultat.år;");
        return query;
    }
    public static String søkFornavnEtternavn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }
    public static String søkEtternavnKjønn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.kjønn = ? AND bruker.etternavn = ? ORDER BY a_resultat.år;");
        return query;
    }

}
