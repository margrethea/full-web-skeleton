package models;

public class QuerysA {
    public QuerysA() {

    }

    public static String alleResultat(String query){
        query = ("select bruker.fornavn, a_resultat.år, a_resultat.periode, a_resultat.60w, a_resultat.bevegelighet, a_resultat.3000m, a_resultat.kroppshev, a_resultat.sargeant FROM ro.bruker, ro.a_resultat WHERE a_resultat.bruker_id=bruker.bruker_id ORDER BY a_resultat.år;");

        return query;
    }
}
