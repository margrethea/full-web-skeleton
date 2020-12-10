package servlets.søking.juniorA;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepo;
import tools.repository.SearchRepo_A;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ToParametre_A", urlPatterns = "/ToParametre_A")
public class ToParametre_A extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellA(out);

        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        SearchRepo_A.søkForEttA(fornavn, etternavn, out);
        System.out.println("to param");


    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
