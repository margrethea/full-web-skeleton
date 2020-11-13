package servlets.søking.senior;


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
        out.println("<html><body><h2> Resultat av søk i senior : </h2>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>Etternavn</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>5000 watt</b></td>");
        out.println("<td><b>5000 tid</b></td>");
        out.println("<td><b>2000 watt</b></td>");
        out.println("<td><b>2000 tid</b></td>");
        out.println("<td><b>Liggende Roing kg</b></td>");
        out.println("<td><b>Liggende Roing p</b></td>");
        out.println("<td><b>knebøy kg</b></td>");
        out.println("<td><b>knebøy p</b></td>");
        out.println("</tr>");

        out.println("<a href=resultatsøk-senior.jsp>Tilbake til resultat</a>");

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

