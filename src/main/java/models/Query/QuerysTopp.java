package models.Query;

public class QuerysTopp {
    /**
     * En egen klasse som lagrer alt av Querys for Senior
     */
    public QuerysTopp() {

    }

    public static String hentToppscore(String query){
        query = ("SELECT t1.bruker_id, t1.5000w res5000w, t1.2000w res2000w, t1.60w res60w, t1.ligg_ro_p resligg_ro_p, t1.knebøy_p resknebøy_p, t1.bevegelighet resbevegelighet, t2.* , t3.* FROM ro.s_resultat t1 CROSS JOIN ro.toppscore_s t2 CROSS JOIN ro.toppscore_prosent t3 ;");

        return query;
    }

    public static String hentToppScoreMenn(String query){
        query = ("select  toppscore from v_toppscore_senior_menn order by toppscore limit 5 ;");

        return query;
    }

    public static String hentToppScoreKvinner(String query){
        query = ("select  toppscore from v_toppscore_senior_kvinner order by toppscore limit 5 ;");

        return query;
    }

}