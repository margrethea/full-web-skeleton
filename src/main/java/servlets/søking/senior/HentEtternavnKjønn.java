package servlets.søking.senior;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepoS;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HentEtternavnKjønn", urlPatterns = "/HentEtternavnKjønn")
public class HentEtternavnKjønn extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellS(out);

        String kjønn = req.getParameter("gender");
        String etternavn = req.getParameter("etternavn");
        SearchRepoS.søkEttKjønn(kjønn, etternavn, out);
        System.out.println("Kjønn og etternavn");


    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
