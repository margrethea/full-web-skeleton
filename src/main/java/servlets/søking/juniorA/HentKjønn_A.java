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

@WebServlet(name = "HentKjønn_A", urlPatterns = "/HentKjønn_A")
public class HentKjønn_A extends AbstractAppServlet {
    /**
     * Skriver ut tabell på nettsiden
     * Henter fra databasen via en annen klasse.
     * @param req
     * @param out
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {

        Tabell.skrivTabellA(out);
        String kjønn = req.getParameter("gender");
        SearchRepoA.søkKjønnA(kjønn, out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

}