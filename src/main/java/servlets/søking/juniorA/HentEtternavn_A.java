package servlets.søking.juniorA;

import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepoA;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Klasse som arver fra AbstractAppServlet, skriver ut tabell på nettside.
 * Henter informasjon fra brukeren, før den kobles opp med Searchrepo_A sin metode som henter ut fra databasen
 * Klasse for søking på etternavn
 */

@WebServlet(name = "HentEtternavn_A", urlPatterns = "/HentEtternavn_A")
public class HentEtternavn_A extends AbstractAppServlet {

    /**
     * Skriver ut body på servlet som html.
     * @param req
     * @param out
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellA(out);
        //Skriver ut på nettsiden

        String år = req.getParameter("etternavn");
        //Henter input fra brukeren

        SearchRepoA.søkEtternavnA(år, out);
        //Henter metode som henter resultater fra databasen

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}