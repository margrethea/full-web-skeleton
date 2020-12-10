package servlets.søking.juniorC;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepo;
import tools.repository.SearchRepoC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "AlleParametre_C", urlPatterns = "/AlleParametre_C")
public class AlleParametre_C extends AbstractAppServlet {
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
        Tabell.skrivTabellC(out);

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
        SearchRepoC.søkAlleParametreC(fornavn, etternavn, periode, kjønn, fødselsår, out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }
}