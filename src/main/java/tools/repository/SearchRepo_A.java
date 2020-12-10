package tools.repository;

import models.Query.QuerysA;
import models.Query.QuerysS;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchRepo_A {

    public static String søkAlleResultatA(PrintWriter p){
        System.out.println("kommer dne hit");
        String toReturn = null;
        refactorAlleRes(QuerysA.alleResultat(toReturn), p);
        return toReturn;
    }


    public static String søkAlleParametreA(String fornavn, String etternavn, String periode, String kjønn, String årstall, String roklubb, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(QuerysA.søkAlleParam(toReturn));
            ps.setString(1, fornavn);
            ps.setString(2, etternavn);
            ps.setString(3, periode);
            ps.setString(4, kjønn);
            ps.setString(5, årstall);
            ps.setString(6, roklubb);
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
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }

    public static String søkFornavnA(String param, PrintWriter p) {
        String toReturn = null;
        refactorEttParam(QuerysA.søkFornavn(toReturn), param,p);
        return toReturn;
    }

    public static String søkEtternavnA(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysA.søkEtternavn(toReturn), param,p);
        return toReturn;
    }
    public static String søkPeriodeA(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysA.søkPeriode(toReturn),param,p);
        return toReturn;
    }

    public static String søkKjønnA(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysA.søkKjønn(toReturn), param, p);
        return toReturn;
    }

    public static String søkKlubb(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysA.søkKjønn(toReturn), param, p);
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

    public static String søkÅrA(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysA.søkÅr(toReturn), param, p);
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
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }


    public static String søkForEttA(String param, String b, PrintWriter p){
        String toReturn = null;
     refactorToParam(QuerysA.søkFornavnEtternavn(toReturn), param, b, p);

        return toReturn;
    }
    public static String søkEttKjønnA(String param, String b, PrintWriter p){
        String toReturn = null;
        refactorToParam(QuerysA.søkEtternavnKjønn(toReturn), param, b, p);

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
                p.println("<td>" + rs.getString("sargeant") + "</td>");
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
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }



}
