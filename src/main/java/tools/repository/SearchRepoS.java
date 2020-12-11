package tools.repository;

import models.Query.QuerysB;
import models.Query.QuerysS;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Repository som inneholder alle metoder for søking på ulike parametre hos Senior
 */
public class SearchRepoS {

    public static String søkAlleResultatS(PrintWriter p){
        String toReturn = null;
        refactorAlleRes(QuerysS.alleResultat(toReturn), p);
        return toReturn;
    }


    public static String søkAlleParametre(String fornavn, String etternavn, String periode, String kjønn, String årstall, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(QuerysS.søkAlleParam(toReturn));
            ps.setString(1, fornavn);
            ps.setString(2, etternavn);
            ps.setString(3, periode);
            ps.setString(4, kjønn);
            ps.setString(5, årstall);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
                p.println("<td>" + rs.getString("etternavn") + "</td>");
                p.println("<td>" + rs.getString("klubbnavn") + "</td>");
                p.println("<td>" + rs.getString("toppscore") + "</td>");
                p.println("<td>" + rs.getString("år") + "</td>");
                p.println("<td>" + rs.getString("periode") + "</td>");
                p.println("<td>" + rs.getString("60w") + "</td>");
                p.println("<td>" + rs.getString("bevegelighet") + "</td>");
                p.println("<td>" + rs.getString("5000w") + "</td>");
                p.println("<td>" + rs.getString("5000t") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>" + rs.getString("knebøy_kg") + "</td>");
                p.println("<td>" + rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }

    public static String søkFornavn(String param, PrintWriter p) {
        String toReturn = null;
        refactorEttParam(QuerysS.søkFornavn(toReturn), param,p);
        return toReturn;
    }

    public static String søkEtternavn(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysS.søkEtternavn(toReturn), param,p);
        return toReturn;
    }
    public static String søkPeriode(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysS.søkPeriode(toReturn),param,p);
        return toReturn;
    }

    public static String søkKjønn(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysS.søkKjønn(toReturn), param, p);
        return toReturn;
    }

    /**
     * Metode som kobler opp mot database
     * Henter Query fra en annen klasse
     * Via Query hentes data ut fra databasen
     * @param param
     * @param p
     * @return
     */

    public static String søkÅr(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysS.søkÅr(toReturn), param, p);
        return toReturn;
    }

    public static String refactorEttParam (String query,String a, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(query);
            ps.setString(1,a);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
                p.println("<td>" + rs.getString("etternavn") + "</td>");
                p.println("<td>" + rs.getString("klubbnavn") + "</td>");
                p.println("<td>" + rs.getString("toppscore") + "</td>");
                p.println("<td>" + rs.getString("år") + "</td>");
                p.println("<td>" + rs.getString("periode") + "</td>");
                p.println("<td>" + rs.getString("60w") + "</td>");
                p.println("<td>" + rs.getString("bevegelighet") + "</td>");
                p.println("<td>" + rs.getString("5000w") + "</td>");
                p.println("<td>" + rs.getString("5000t") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>" + rs.getString("knebøy_kg") + "</td>");
                p.println("<td>" + rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }


    public static String søkForEtt(String param, String b, PrintWriter p){
        String toReturn = null;
     refactorToParam(QuerysS.søkFornavnEtternavn(toReturn), param, b, p);

        return toReturn;
    }
    public static String søkEttKjønn(String param, String b, PrintWriter p){
        String toReturn = null;
        refactorToParam(QuerysS.søkEtternavnKjønn(toReturn), param, b, p);

        return toReturn;
    }
    public static String søkKlubbKjønn(String param, String b, PrintWriter p){
        String toReturn = null;
        refactorToParam(QuerysS.søkKlubbKjønn(toReturn),param,b,p);
        return toReturn;
    }

    public static String søkRoklubb(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysS.søkKlubb(toReturn), param, p);
        System.out.println("kommer den hit");
        return toReturn;
    }

    public static  String søkKlubbForEtt(String param, String a, String b, PrintWriter p){
        String toReturn = null;
        refactorTreParam(QuerysS.søkTreParam(toReturn),param,a,b,p);
        return toReturn;
    }

    public static String refactorToParam (String query,String a, String b, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(query);
            ps.setString(1,a);
            ps.setString(2,b);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
                p.println("<td>" + rs.getString("etternavn") + "</td>");
                p.println("<td>" + rs.getString("klubbnavn") + "</td>");
                p.println("<td>" + rs.getString("toppscore") + "</td>");
                p.println("<td>" + rs.getString("år") + "</td>");
                p.println("<td>" + rs.getString("periode") + "</td>");
                p.println("<td>" + rs.getString("60w") + "</td>");
                p.println("<td>" + rs.getString("bevegelighet") + "</td>");
                p.println("<td>" + rs.getString("5000w") + "</td>");
                p.println("<td>" + rs.getString("5000t") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>" + rs.getString("knebøy_kg") + "</td>");
                p.println("<td>" + rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }

    public static String refactorTreParam (String query,String a, String b,String c, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(query);
            ps.setString(1,a);
            ps.setString(2,b);
            ps.setString(3,c);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
                p.println("<td>" + rs.getString("etternavn") + "</td>");
                p.println("<td>" + rs.getString("klubbnavn") + "</td>");
                p.println("<td>" + rs.getString("toppscore") + "</td>");
                p.println("<td>" + rs.getString("år") + "</td>");
                p.println("<td>" + rs.getString("periode") + "</td>");
                p.println("<td>" + rs.getString("60w") + "</td>");
                p.println("<td>" + rs.getString("bevegelighet") + "</td>");
                p.println("<td>" + rs.getString("5000w") + "</td>");
                p.println("<td>" + rs.getString("5000t") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>" + rs.getString("knebøy_kg") + "</td>");
                p.println("<td>" + rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }

    public static String refactorAlleRes (String query, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
                p.println("<td>" + rs.getString("etternavn") + "</td>");
                p.println("<td>" + rs.getString("klubbnavn") + "</td>");
                p.println("<td>" + rs.getString("toppscore") + "</td>");
                p.println("<td>" + rs.getString("år") + "</td>");
                p.println("<td>" + rs.getString("periode") + "</td>");
                p.println("<td>" + rs.getString("60w") + "</td>");
                p.println("<td>" + rs.getString("bevegelighet") + "</td>");
                p.println("<td>" + rs.getString("5000w") + "</td>");
                p.println("<td>" + rs.getString("5000t") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>" + rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>" + rs.getString("knebøy_kg") + "</td>");
                p.println("<td>" + rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }



}
