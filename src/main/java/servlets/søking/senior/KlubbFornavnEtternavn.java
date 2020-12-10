package servlets.søking.senior;


import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.SearchRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KlubbFornavnEtternavn", urlPatterns = "/KlubbFornavnEtternavn")
public class KlubbFornavnEtternavn extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Tabell.skrivTabellS(out);

        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        String klubb = req.getParameter("roklubb");
        SearchRepo.søkKlubbForEtt(fornavn, etternavn, klubb, out);
        System.out.println("Kjønn og etternavn");


    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}

