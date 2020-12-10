package tools.repository;

import models.Query.QuerysB;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchRepoB {

    public static String søkAlleResultatB (PrintWriter p){
        String toReturn = null;
        refactorAlleRes(QuerysB.alleResultatB(toReturn),p);
        return toReturn;
    }

    public static String søkAlleParametreB(String fornavn, String etternavn, String periode, String kjønn, String årstall, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(QuerysB.søkAlleParamB(toReturn));
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
                p.println("<td>" + rs.getString("3000m") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("kroppshev") + "</td>");
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }

    public static String søkFornavnB(String param, PrintWriter p) {
        String toReturn = null;
        refactorEttParam(QuerysB.søkFornavnB(toReturn), param,p);
        return toReturn;
    }

    public static String søkEtternavnB(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysB.søkEtternavnB(toReturn), param,p);
        return toReturn;
    }
    public static String søkPeriodeB(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysB.søkPeriodeB(toReturn),param,p);
        return toReturn;
    }

    public static String søkKjønnB(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysB.søkKjønnB(toReturn), param, p);
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

    public static String søkÅrB(String param, PrintWriter p){
        String toReturn = null;
        refactorEttParam(QuerysB.søkÅrB(toReturn), param, p);
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
                p.println("<td>" + rs.getString("3000m") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("kroppshev") + "</td>");
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }


    public static String søkForEttB(String param, String b, PrintWriter p){
        String toReturn = null;
        refactorToParam(QuerysB.søkFornavnEtternavnB(toReturn), param, b, p);

        return toReturn;
    }
    public static String søkEttKjønnB(String param, String b, PrintWriter p){
        String toReturn = null;
        refactorToParam(QuerysB.søkEtternavnKjønnB(toReturn), param, b, p);

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
                p.println("<td>" + rs.getString("3000m") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("kroppshev") + "</td>");
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
                p.println("<td>" + rs.getString("3000m") + "</td>");
                p.println("<td>" + rs.getString("2000w") + "</td>");
                p.println("<td>" + rs.getString("2000t") + "</td>");
                p.println("<td>" + rs.getString("kroppshev") + "</td>");
                p.println("<td>" + rs.getString("sargeant") + "</td>");
                p.println("</tr>");
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }



}