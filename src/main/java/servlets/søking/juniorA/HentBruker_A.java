package servlets.søking.juniorA;

import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepo_A;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Klasse som arver fra AbstractAppServlet, skriver ut på nettsiden
 * Henter informasjon fra brukeren, før den kobles opp med Searchrepo_A sin metode som henter fra databasen.
 * Klasse for søking på ingen parametre
 */
@WebServlet(name = "HentBruker_A", urlPatterns = "/HentBrukerA")
public class HentBruker_A extends AbstractAppServlet {

    /**
     * Skriver ut body på servlet som html
     * @param req
     * @param out
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellA(out);

        SearchRepo_A.søkAlleResultatA(out);
        //Henter metode som henter ut resultat fra databasen.

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hent bruker A");
    }

}
