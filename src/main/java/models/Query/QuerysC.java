package models.Query;

import java.sql.PreparedStatement;

public class QuerysC {

    public QuerysC() {

    }

    public static String alleResultat(String query){
      query = ("select bruker.fornavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id AND bruker.klasse_id = 4 ORDER BY c_resultat.år;");

      return query;
    }

    public static String søkFornavn(String query){
        query = ("SELECT bruker.fornavn, bruker.etternavn, c_resultat.60w, c_resultat.bevegelighet, c_resultat.`3000m`, c_resultat.kroppshev, c_resultat.sargeant, c_resultat.år, c_resultat.periode FROM ro.c_resultat, ro.bruker WHERE bruker.bruker_id = c_resultat.bruker_id AND bruker.klasse_id = 4 AND bruker.fornavn = '?';");
        return query;
    }

}
