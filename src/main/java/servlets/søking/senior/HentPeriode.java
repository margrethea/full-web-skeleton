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

@WebServlet(name = "HentPeriode", urlPatterns = "/HentPeriode")
public class HentPeriode extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellS(out);
        String periode = req.getParameter("periode");
        SearchRepoS.søkPeriode(periode, out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}