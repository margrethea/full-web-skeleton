package models;

public class QuerysS {
    public QuerysS() {

    }

    public static String alleResultat(String query){
        query = ("select bruker.fornavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.5000w, s_resultat.5000t, s_resultat.2000w, s_resultat.2000t, s_resultat.ligg_ro_kg, s_resultat.ligg_ro_p, s_resultat.knebøy_kg, s_resultat.knebøy_p, s_resultat.toppscore FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 1 ORDER BY s_resultat.år;");

        return query;
    }
}
