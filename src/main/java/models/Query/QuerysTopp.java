package models.Query;

public class QuerysTopp {
    /**
     * En egen klasse som lagrer alt av Querys for Senior
     */
    public QuerysTopp() {

    }

public static String hentToppscore(String query){
      query = ("SELECT * FROM ro.toppscore_s;");

      return query;
  }

}
