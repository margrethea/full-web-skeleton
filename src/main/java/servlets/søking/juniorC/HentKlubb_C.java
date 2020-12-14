package servlets.søking.juniorC;

import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepoC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HentKlubb_C", urlPatterns = "/HentKlubb_C")
public class HentKlubb_C extends AbstractAppServlet {
    /**
     * Skriver ut tabell på nettsiden
     * Henter fra databasen via en annen klasse.
     * @param req
     * @param out
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellC(out);
        String roklubb = req.getParameter("roklubb");
        SearchRepoC.søkKlubbC(kjønn, out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

}