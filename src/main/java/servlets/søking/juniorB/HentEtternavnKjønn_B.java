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

@WebServlet(name = "HentEtternavnKjønn_B", urlPatterns = "/HentEtternavnKjønn_B")
public class HentEtternavnKjønn_B extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellB(out);

        String kjønn = req.getParameter("gender");
        String etternavn = req.getParameter("etternavn");
        SearchRepoB.søkEttKjønnB(kjønn, etternavn, out);
        System.out.println("Kjønn og etternavn");


    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
