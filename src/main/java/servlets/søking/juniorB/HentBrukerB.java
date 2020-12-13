package servlets.søking.juniorB;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepoB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HentBrukerB", urlPatterns = "/HentBrukerB")
public class HentBrukerB extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out){

        Tabell.skrivTabellB(out);

        SearchRepoB.søkAlleResultatB(out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hent bruker B");
    }

}
