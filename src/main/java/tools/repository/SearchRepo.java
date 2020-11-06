package tools.repository;

import models.QuerysS;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchRepo {

    public static String søkAlleResultat(PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(QuerysS.alleResultat(toReturn));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>"+rs.getString("fornavn") + "</td>");
                p.println("<td>"+rs.getString("toppscore") + "</td>");
                p.println("<td>"+rs.getString("år") + "</td>");
                p.println("<td>"+rs.getString("periode") + "</td>");
                p.println("<td>"+rs.getString("60w") + "</td>");
                p.println("<td>"+rs.getString("bevegelighet") + "</td>");
                p.println("<td>"+rs.getString("5000w") + "</td>");
                p.println("<td>"+rs.getString("5000t") + "</td>");
                p.println("<td>"+rs.getString("2000w") + "</td>");
                p.println("<td>"+rs.getString("2000t") + "</td>");
                p.println("<td>"+rs.getString("ligg_ro_kg") + "</td>");
                p.println("<td>"+rs.getString("ligg_ro_p") + "</td>");
                p.println("<td>"+rs.getString("knebøy_kg") + "</td>");
                p.println("<td>"+rs.getString("knebøy_p") + "</td>");
                p.println("</tr>");

            }rs.close();


        }catch (SQLException throwables ){
            throwables.printStackTrace();
        }

        return toReturn;
    }

    public static String søkEtParameter(String fornavn, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ps = db.prepareStatement(QuerysS.søkFornavn(toReturn));
            ps.setString(1,fornavn);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.println("<tr>");
                p.println("<td>" + rs.getString("fornavn") + "</td>");
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