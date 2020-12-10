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

@WebServlet(name = "HentEtternavnKjønn_C", urlPatterns = "/HentEtternavnKjønn_C")
public class HentEtternavnKjønn_C extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellC(out);

        String kjønn = req.getParameter("gender");
        String etternavn = req.getParameter("etternavn");
        SearchRepoC.søkEttKjønnC(kjønn, etternavn, out);
        System.out.println("Kjønn og etternavn");


    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
