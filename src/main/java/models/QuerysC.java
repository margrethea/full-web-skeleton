package models;

import java.sql.PreparedStatement;

public class QuerysC {

    public QuerysC() {

    }

    public static String alleResultat(String query){
      query = ("select bruker.fornavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id ORDER BY c_resultat.år;");

      return query;
    }

}
