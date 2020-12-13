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
 * Henter informasjon fra brukeren, før den kobles opp med SearchRepo_A sin metode som henter fra databasen
 * Klasse for søking på etternavn og kjønn
 */

@WebServlet(name = "HentEtternavnKjønn_A", urlPatterns = "/HentEtternavnKjønn_A")
public class HentEtternavnKjønn_A extends AbstractAppServlet {

    /**
     * Skriver ut body på servlet som html
     * @param req
     * @param out
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellA(out);
        //Skriver ut på nettsiden


        String kjønn = req.getParameter("gender");
        String etternavn = req.getParameter("etternavn");
        //Henter input fra brukeren

        SearchRepoA.søkEttKjønnA(kjønn, etternavn, out);
        //Henter metode som henter resultat fra databasen

        System.out.println("Kjønn og etternavn");
        //Testing

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
