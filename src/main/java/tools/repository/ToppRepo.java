package tools.repository;

import models.Query.QuerysTopp;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ToppRepo {

    public static String søkAlleResultatS(PrintWriter p){
        String toReturn = null;
        refactorAlleRes(QuerysTopp.hentToppscore(toReturn), p);
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
              while (rs.next())

                  p.println("<tr>");
                  p.println("<td>" + rs.getString("5000mean") + "</td>");
                  p.println("<td>" + rs.getString("5000sd") + "</td>");
                  p.println("<td>" + rs.getString("2000mean") + "</td>");
                  p.println("<td>" + rs.getString("2000sd") + "</td>");
                  p.println("<td>" + rs.getString("60mean") + "</td>");
                  p.println("<td>" + rs.getString("60sd") + "</td>");
                  p.println("<td>" + rs.getString("ligg_ro_mean") + "</td>");
                  p.println("<td>" + rs.getString("ligg_ro_sd") + "</td>");
                  p.println("<td>" + rs.getString("kneboymean") + "</td>");
                  p.println("<td>" + rs.getString("kneboysd") + "</td>");
                  p.println("<td>" + rs.getString("bevegmean") + "</td>");
                  p.println("<td>" + rs.getString("bevegsd") + "</td>");
                  p.println("</tr>");
              }

            }catch (SQLException throwables){
              throwables.printStackTrace();
          }
          return toReturn;
      }
}
