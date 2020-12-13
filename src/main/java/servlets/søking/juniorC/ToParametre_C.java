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

@WebServlet(name = "ToParametre_C", urlPatterns = "/ToParametre_C")
public class ToParametre_C extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellC(out);

        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        SearchRepoC.søkForEttC(fornavn, etternavn, out);
        System.out.println("to param");

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
