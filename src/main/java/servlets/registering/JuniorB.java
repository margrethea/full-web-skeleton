package servlets.registering;

import models.øvelse.ØvelseBModell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorB", urlPatterns = {"/JuniorB"})
public class JuniorB extends AbstractAppServlet {


    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String beveglighet = req.getParameter("bevegelighet");
        String tretusen = req.getParameter("3000m");
        String totusenW = req.getParameter("2000m_w");
        String totusenT = req.getParameter("20000m_t");
        String kroppshev = req.getParameter("kroppshev");
        String sargeant = req.getParameter("sargeant");
        int brukerid = Integer.parseInt(req.getParameter("ListUtøver"));
        int testperiode = Integer.parseInt(req.getParameter("testperiode"));

        ØvelseBModell regResultat = new ØvelseBModell(testperiode, brukerid, seksti, beveglighet, tretusen, totusenW, totusenT, kroppshev, sargeant);
        Øvelserepo.regResultatB(regResultat, out);
        System.out.println(regResultat);
        out.println("<html><body><h2> Registrerte resultater for Junior B </h2>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>BrukerID</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>3000 meter</b></td>");
        out.println("<td><b>2000 watt</b></td>");
        out.println("<td><b>2000 tid</b></td>");
        out.println("<td><b>Kroppshev</b></td>");
        out.println("<td><b>Sargeant</b></td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>"+ brukerid +"</td>");
        out.println("<td>2020</td>");
        out.println("<td>"+testperiode+ "</td>");
        out.println("<td>"+seksti+ "</td>");
        out.println("<td>"+beveglighet+ "</td>");
        out.println("<td>"+tretusen+ "</td>");
        out.println("<td>"+totusenW+ "</td>");
        out.println("<td>"+totusenT+ "</td>");
        out.println("<td>"+kroppshev+ "</td>");
        out.println("<td>"+sargeant+ "</td>");
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
}