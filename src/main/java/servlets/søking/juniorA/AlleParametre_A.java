package servlets.søking.juniorA;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepo;
import tools.repository.SearchRepo_A;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Klasse som arver fra AbstractAppServlet, skriver ut tabell på nettside.
 * Henter informasjon fra brukeren, før den kobles opp med SearchRepo_A sin metode som henter fra datbasen.
 * Klasse for søking på alle parametre
 */
@WebServlet(name = "AlleParametre_A", urlPatterns = "/AlleParametre_A")
public class AlleParametre_A extends AbstractAppServlet {

    /**
     * skriver ut body på servlet som html.
     * @param req http request objektet med data.
     * @param out http respons objektet som sender data.
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellA(out);
        //Skriver ut tabell på nettsiden

        String år = req.getParameter("year");
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        String periode = req.getParameter("periode");
        String kjønn = req.getParameter("gender");
        String fødselsår = req.getParameter("year");
        String klubb = req.getParameter("roklubb");
        //Henter Input fra brukeren


        SearchRepo_A.søkAlleParametreA(fornavn, etternavn, periode, kjønn, fødselsår, klubb, out);
        // Henter metode som henter resultater ut fra databasen

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }
}