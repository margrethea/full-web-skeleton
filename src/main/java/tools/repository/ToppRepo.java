package tools.repository;

import models.Query.QuerysTopp;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

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

            int ascdesc = 1;
            DecimalFormat df = new DecimalFormat("0.00");
            double mean = 80.0;
            double std_dev = 10.0;


            while (rs.next()) {

                Float femkmean = rs.getFloat("5000mean");
                Float femksd = rs.getFloat("5000sd");
                Float tokmean = rs.getFloat("2000mean");
                Float toksd = rs.getFloat("2000sd");
                Float sekstimean = rs.getFloat("60mean");
                Float sekstisd = rs.getFloat("60sd");
                Float ligg_ro_mean = rs.getFloat("ligg_ro_mean");
                Float ligg_ro_sd = rs.getFloat("ligg_ro_sd");
                Float kneboymean = rs.getFloat("kneboymean");
                Float kneboysd = rs.getFloat("kneboysd");
                Float bevegmean = rs.getFloat("bevegmean");
                Float bevegsd = rs.getFloat("bevegsd");

                int femkw = rs.getInt("5000w");
                int tokw = rs.getInt("2000w");
                int sekstiw = rs.getInt("60w");
                int ligg_ro = rs.getInt("ligg_ro");
                int kneboy = rs.getInt("kneboy");
                int bevegelighet = rs.getInt("bevegelighet");


                //t1.2000w res2000w, t1.60w res60w, t1.ligg_ro_p resligg_ro_p, t1.bevegelighet resbevegelighet
                int femkwres = rs.getInt("res5000w");
                int tokwres = rs.getInt("res2000w");
                int sekstikwres = rs.getInt("res60w");
                int ligg_ro_res = rs.getInt("resligg_ro_p");
                int knebøy_res = rs.getInt("resknebøy_p");
                int bevegelighetres = rs.getInt("resbevegelighet");

                double step1_5000w = (((femkwres-femkmean)/femksd*ascdesc) * ((double) femkw/100));
                double step1_2000w = (((tokwres-tokmean)/toksd*ascdesc) * ((double) tokw/100));
                double step1_60w = (((sekstikwres-sekstimean)/sekstisd*ascdesc) * ((double) sekstiw/100));
                double step1_ligg_ro = (((ligg_ro_res-ligg_ro_mean)/ligg_ro_sd*ascdesc) * ((double) ligg_ro/100));
                double step1_knebøy = (((knebøy_res-kneboymean)/kneboysd*ascdesc) * ((double) kneboy/100));
                double step1_bevegelighet = (((bevegelighetres-bevegmean)/bevegsd*ascdesc) * ((double) bevegelighet/100));
                double step1_sum = (step1_5000w+step1_2000w+step1_60w+step1_ligg_ro+step1_knebøy+step1_bevegelighet);

                double sum = (step1_sum*std_dev+mean);

                p.println("<tr>");
                p.println("<td>" + femkmean + "</td>");
                p.println("<td>" + femksd + "</td>");
                p.println("<td>" + tokmean + "</td>");
                p.println("<td>" + toksd + "</td>");
                p.println("<td>" + sekstimean + "</td>");
                p.println("<td>" + sekstisd + "</td>");
                p.println("<td>" + ligg_ro_mean + "</td>");
                p.println("<td>" + ligg_ro_sd + "</td>");
                p.println("<td>" + kneboymean + "</td>");
                p.println("<td>" + kneboysd + "</td>");
                p.println("<td>" + bevegmean + "</td>");
                p.println("<td><b>" + bevegsd + "</b></td>");


                p.println("<td>" + femkw + "</td>");
                p.println("<td>" + tokw + "</td>");
                p.println("<td>" + sekstiw + "</td>");
                p.println("<td>" + ligg_ro + "</td>");
                p.println("<td>" + kneboy + "</td>");
                p.println("<td>" + bevegelighet + "</td>");


                p.println("<td>" + femkwres + "</td>");
                p.println("<td>" + tokwres + "</td>");
                p.println("<td>" + sekstikwres + "</td>");
                p.println("<td>" + ligg_ro_res + "</td>");
                p.println("<td>" + knebøy_res + "</td>");
                p.println("<td>" + bevegelighetres + "</td>");
                p.println("<td>" + df.format(step1_5000w) + "</td>");
                p.println("<td>" + df.format(step1_2000w) + "</td>");
                p.println("<td>" + df.format(step1_60w) + "</td>");
                p.println("<td>" + df.format(step1_ligg_ro)  + "</td>");
                p.println("<td>" + df.format(step1_knebøy)  + "</td>");
                p.println("<td>" + df.format(step1_bevegelighet)  + "</td>");
                p.println("<td>" + df.format(step1_sum)  + "</td>");

                p.println("<td>" + df.format(sum)  + "</td>");

                p.println("</tr>");


/*
                for(int i = 0; i < listSize; i++) {

                    PreparedStatement  ps_2 = db.prepareStatement("SELECT 5000w from s_resultat WHERE  bruker_id = ?");
                    ps_2.setInt(1, i);
                    ResultSet rs1 = ps_2.executeQuery();

                    //ResultSet rs1 = ps.executeQuery("SELECT 5000w FROM s_resultat WHERE bruker_id = "i" ");

                    int femkw2 = rs1.getInt("5000w");
                    p.println("<tr>");
                    p.println("<td>" + femkw2 + "</td>");
                    p.println("</tr>");


                    while (rs1.next()) {
                        int  femktempto = rs.getInt("5000w");
                        int femktemp = ((femktempto - femkmean) / femksd) * (femkw * 0.1);
                        System.out.println(femktemp);
                    }

                    rs1.close();


                }
*/
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return toReturn;
    }
}
