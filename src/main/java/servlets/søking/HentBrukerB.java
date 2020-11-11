package servlets.søking;


import models.Query.QuerysB;
import servlets.tryms.AbstractAppServlet;
import tools.DbTool;
import tools.repository.SearchRepo;
import tools.repository.SearchRepoB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "HentBrukerB", urlPatterns = "/HentBrukerB")
public class HentBrukerB extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out){

        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i senior : </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>Etternavn</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>3000m</b></td>");
        out.println("<td><b>2000 watt</b></td>");
        out.println("<td><b>2000 tid</b></td>");
        out.println("<td><b>Kroppshev</b></td>");
        out.println("<td><b>Sargeant</b></td>");
        out.println("</tr>");

        out.println("<a href=resultatsøk-juniorB.jsp>Tilbake til resultat</a>");

        SearchRepoB.søkAlleResultat(out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hent bruker B");
    }

}
