package servlets.registering;

import models.bruker.BrukerModell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.BrukerRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet for å registrere bruker
 */
@WebServlet(name = "RegistrerBruker", urlPatterns = {"/RegistrerBruker"})
public class RegistrerBruker extends AbstractAppServlet {

    /**
     * Metoden henter parametre fra brukeren før den kobler opp med databasen ved hjelp av brukermodell
     * Deretter lages en tabell, og parametrene blir skrivet inn i tabellen
     * @param req
     * @param out
     */
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

        out.format("<h1>Bruker " + fornavn + " er registrert</h1>");


        BrukerModell Bruker = new BrukerModell(fornavn,etternavn,epost,fødselsår,kjønn,roklubbid, klasseid);
        BrukerRepository.regResultatBruker(Bruker, out);
        System.out.println(Bruker);
        out.println("<html><head><link rel='stylesheet' href='main.css'></head>");
        out.println("<div class='tabellcss'>");
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

        out.println("<a href=registrer-resultat.jsp>Tilbake til registrer resultat</a>");
}

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Registrert bruker");
    }
}