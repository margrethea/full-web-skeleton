package servlets;

import models.BrukerModell;
//import models.ØvelseSmodell;
import tools.repository.BrukerRepository;
//import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrerBruker", urlPatterns = {"/servlets.RegistrerBruker"})
public class RegistrerBruker extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String fornavn = req.getParameter("fornavn");
        String etternavn = req.getParameter("etternavn");
        String epost = req.getParameter("epost");
        String fødselsår = req.getParameter("fødselsår");
        String kjønn = req.getParameter("kjønn");
        int roklubbid = Integer.parseInt(req.getParameter("ListRoklubb"));
        int klasseid = Integer.parseInt(req.getParameter("klasse"));
        System.out.println(fornavn + etternavn + epost + fødselsår + kjønn + roklubbid);

        BrukerModell reqResultatBruker = new BrukerModell(fornavn, etternavn, epost, fødselsår, kjønn, roklubbid, klasseid);
        BrukerRepository.regResultatBruker(reqResultatBruker, out);

        out.format("<h1>Bruker er registrert</h1>", fornavn);


        BrukerModell Bruker = new BrukerModell(fornavn,etternavn,epost,fødselsår,kjønn,roklubbid, klasseid);
        BrukerRepository.regResultatBruker(Bruker, out);
        System.out.println(Bruker);
        out.println("<html><body><h2> Registrert bruker </h2>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>Etternavn</b></td>");
        out.println("<td><b>E-post</b></td>");
        out.println("<td><b>Fødseslår</b></td>");
        out.println("<td><b>Kjønn</b></td>");
        out.println("<td><b>Roklubb</b></td>");
        out.println("<td><b>Klasse</b></td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>"+fornavn+ "</td>");
        out.println("<td>"+etternavn+ "</td>");
        out.println("<td>"+epost+ "</td>");
        out.println("<td>"+fødselsår+ "</td>");
        out.println("<td>"+kjønn+ "</td>");
        out.println("<td>"+roklubbid+ "</td>");
        out.println("<td>"+klasseid+ "</td>");
        out.println("</tr>");
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