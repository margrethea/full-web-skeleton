package servlets;

import models.BrukerModell;
import tools.repository.BrukerRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrerBruker", urlPatterns = {"/RegistrerBruker"})
public class RegistrerBruker extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        String epost = req.getParameter("epost");
        String fødselsår = req.getParameter("fødselsår");
        String kjønn = req.getParameter("kjønn");
        String roklubb = req.getParameter("roklubb");
        System.out.println(fornavn + etternavn + epost + fødselsår + kjønn + roklubb);

        BrukerModell reqResultat = new BrukerModell(fornavn, etternavn, epost, fødselsår, kjønn, roklubb);
        BrukerRepository.regResultatBruker(reqResultat, out);

        out.format("<h1> %s Has been added to the database with id: %s</h1>", fornavn);
    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Added to database");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}