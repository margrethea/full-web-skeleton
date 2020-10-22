package models;

public class QuerysS {
    public QuerysS() {

    }

    public static String alleResultat(String query){
        query = ("select bruker.fornavn, s_resultat.år, s_resultat.periode, s_resultat.60w, s_resultat.bevegelighet, s_resultat.3000m, s_resultat.kroppshev, s_resultat.sargeant FROM ro.bruker, ro.s_resultat WHERE s_resultat.bruker_id=bruker.bruker_id ORDER BY s_resultat.år;");

        return query;
    }
}
