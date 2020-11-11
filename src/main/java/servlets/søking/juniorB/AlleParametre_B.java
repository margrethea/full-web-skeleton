package servlets.søking.juniorB;


import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepoB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "AlleParametre_B", urlPatterns = "/AlleParametre_B")
public class AlleParametre_B extends AbstractAppServlet {
    /**
     * skriver ut body på servlet som html.
     * @param req http request objektet med data.
     * @param out http respons objektet som sender data.
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        /**
         * Printer ut tabell for resultatsøk
         */
        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i Junior B: </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>Etternavn</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>3000 meter</b></td>");
        out.println("<td><b>2000 watt</b></td>");
        out.println("<td><b>2000 tid</b></td>");
        out.println("<td><b>Kroppshev</b></td>");
        out.println("<td><b>Sargeant</b></td>");
        out.println("</tr>");

        out.println("<a href=resultatsøk-juniorB.jsp>Tilbake til resultat</a>");

        /**
         * Henter input fra brukeren fra inputfeltene
         */
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        String periode = req.getParameter("periode");
        String kjønn = req.getParameter("gender");
        String fødselsår = req.getParameter("year");

        /**
         * Henter metode fra klassen SearchRepo som henter informasjon fra databasen
         */
        SearchRepoB.søkAlleParametreB(fornavn, etternavn, periode, kjønn, fødselsår, out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }
}