package models.Query;

public class QuerysS {
    public QuerysS() {

    }
    // Query som henter ut alle resultat for en utøver, og matcher det med bruker_id
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String alleResultat(String query){
        query = ("select bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 1 ORDER BY s_resultat.år;");

        return query;
    }
    // Query som henter ut resultat etter søking på fornavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkFornavn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? ORDER BY s_resultat.år;");

        return query;

    }
    // Query som henter ut resultat etter søking på alle parametre
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkAlleParam(String query){
        query = ("select bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.fornavn = ? AND bruker.etternavn = ? AND s_resultat.periode = ? AND bruker.kjønn = ? AND s_resultat.år = ? ORDER BY s_resultat.år;");

        return query;
    }
    // Query som henter ut resultat etter søking på etternavn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkEtternavn(String query){
        query = ("select bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id = bruker.bruker_id AND bruker.etternavn = ? ORDER BY s_resultat.år;");
    return query;
    }
    // Query som henter ut resultat etter søking på periode
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkPeriode(String query){
        query = ("select bruker.fornavn, bruker.etternavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id = bruker.bruker_id AND s_resultat.periode = ? ORDER BY s_resultat.år;");
    return query;
    }
    // Query som henter ut resultat etter søking på kjønn
    //Sorteres etter år
    //Brukes i klassen SearchRepo
    public static String søkKjønn(String query){
        query = ("");   //må fylles

        return query;
    }
    public static String søkÅr(String query){
        query = ("");   //Må fylles
        return query;
    }

}
