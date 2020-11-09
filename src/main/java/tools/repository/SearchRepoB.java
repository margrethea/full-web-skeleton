package tools.repository;

import models.Query.QuerysB;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchRepoB {

    public static String søkAlleResultat (PrintWriter p){
        String toReturn = null;
        refactorAlleRes(QuerysB.alleResultat(toReturn),p);
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
