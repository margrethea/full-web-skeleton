package tools.repository;

import models.Query.QuerysTopp;

import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class ToppScoreRepo {

    public static String VisToppScoreMenn(PrintWriter p){
        String toReturn = null;
        HentToppScore(QuerysTopp.hentToppScoreMenn(toReturn), p);
        return toReturn;
    }

    public static String VisToppScoreKvinner(PrintWriter p){
        String toReturn = null;
        HentToppScore(QuerysTopp.hentToppScoreKvinner(toReturn), p);
        return toReturn;
    }

    public static String HentToppScore(String query, PrintWriter p){
        Connection db = null;
        PreparedStatement ps = null;

        String toReturn = null;

        try{
            db = DbTool.getINSTANCE().dbLoggIn(p);

            ps = db.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            DecimalFormat df = new DecimalFormat("0.0");

            int i = 1;

            while (rs.next()) {

                double ts =  rs.getDouble("toppscore");

                p.println("<tr>");
                p.println("<td>" + i + "</td>");
                p.println("<td>" + df.format(ts)+ "</td>");
                p.println("</tr>");
                i = i + 1;
            }
            rs.close();
        }

        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }


}
