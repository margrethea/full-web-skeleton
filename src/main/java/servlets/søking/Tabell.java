package servlets.søking;

import java.io.PrintWriter;

public class Tabell {

    public static void skrivTabellA(PrintWriter out){
        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i Junior A: </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>Etternavn</b></td>");
        out.println("<td><b>Roklubb</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>5000 watt</b></td>");
        out.println("<td><b>5000 tid</b></td>");
        out.println("<td><b>2000 watt</b></td>");
        out.println("<td><b>2000 tid</b></td>");
        out.println("<td><b>Liggende Roing kg</b></td>");
        out.println("<td><b>Liggende Roing p</b></td>");
        out.println("<td><b>sargeant</b></td>");
        out.println("</tr>");

        out.println("<a href=resultatsøk-juniorA.jsp>Tilbake til resultat</a>");
    }
}
