package models;

import java.sql.PreparedStatement;

public class QuerysB {
    public QuerysB() {

    }

    public static String alleResultat(String query){
        query = ("select bruker.fornavn, b_resultat.år, b_resultat.periode, b_resultat.60w, b_resultat.bevegelighet, b_resultat.3000m, b_resultat.2000w, b_resultat.2000t, b_resultat.kroppshev, b_resultat.sargeant, b_resultat.toppscore FROM ro.bruker, ro.b_resultat WHERE b_resultat.bruker_id=bruker.bruker_id ORDER BY b_resultat.år;");

        return query;
    }
}
