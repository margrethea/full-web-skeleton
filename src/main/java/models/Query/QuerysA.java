package models.Query;

public class QuerysA {
    /**
     * En egen klasse som lagrer alt av Querys for Junior A
     */
    public QuerysA() {

    }

    public static String alleResultat(String query){
        query = ("select bruker.fornavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.5000w, a_resultat.5000t, a_resultat.2000w, a_resultat.2000t, a_resultat.ligg_ro_kg, a_resultat.ligg_ro_p, a_resultat.sargeant, a_resultat.toppscore FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 2 ORDER BY a_resultat.år;");

        return query;
    }
}
