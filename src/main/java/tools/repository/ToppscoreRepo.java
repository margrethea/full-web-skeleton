package tools.repository;

import models.Query.QuerysTopp;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchRepo {

    public static String hentToppscore(PrintWriter p){
        String toReturn = null;
        refactorAlleRes(QuerysTopp.hentToppscore(toReturn);
        return toReturn;
    }
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
              p.println("<td>" + rs.getString("5000w") + "</td>");
              p.println("<td>" + rs.getString("2000w") + "</td>");
              p.println("<td>" + rs.getString("60w") + "</td>");
              p.println("<td>" + rs.getString("ligg_ro") + "</td>");
              p.println("<td>" + rs.getString("kneboy") + "</td>");
              p.println("<td>" + rs.getString("bevegelighet") + "</td>");

              p.println("</tr>");

              5000mean = rs.getString("5000mean");
              5000sd = rs.getString("5000sd");
              2000mean = rs.getString("2000mean");

              
              2000sd = rs.getString("2000sd");
          }

      }catch (SQLException throwables){
          throwables.printStackTrace();
      }
      return toReturn;
  }
