package servlets.registering;

import servlets.tryms.AbstractAppServlet;
import tools.repository.Øvelserepo;
import models.øvelse.ØvelseSmodell;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Senior", urlPatterns = {"/Senior"})
public class Senior extends AbstractAppServlet {



    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String beveglighet = req.getParameter("bevegelighet");
        String femtusenw = req.getParameter("5000m_w");
        String femtusent = req.getParameter("5000m_t");
        String totusenw = req.getParameter("2000m_w");
        String totusent = req.getParameter("2000m_t");
        String ligg_ro_p = req.getParameter("ligg_ro_p");
        String ligg_ro_kg = req.getParameter("ligg_ro_kg");
        String kneboy_p = req.getParameter("kneboy_p");
        String kneboy_kg = req.getParameter("kneboy_kg");
        int brukerid = Integer.parseInt(req.getParameter("ListUtøver"));
        int testperiode = Integer.parseInt(req.getParameter("testperiode"));



        ØvelseSmodell regResultat = new ØvelseSmodell(testperiode,brukerid,seksti,beveglighet,femtusenw,femtusent,totusenw,totusent,ligg_ro_p,ligg_ro_kg,kneboy_p,kneboy_kg);
        Øvelserepo.regResultatS(regResultat, out);
        System.out.println(regResultat);
        out.println("<html><body><h2> Registrerte resultater </h2>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>BrukerID</b></td>");
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


        out.println("<tr>");
        out.println("<td>"+ brukerid +"</td>");
        out.println("<td>2020</td>");
        out.println("<td>"+testperiode+ "</td>");
        out.println("<td>"+seksti+ "</td>");
        out.println("<td>"+beveglighet+ "</td>");
        out.println("<td>"+femtusenw+ "</td>");
        out.println("<td>"+femtusent + "</td>");
        out.println("<td>"+totusenw+ "</td>");
        out.println("<td>"+totusent+ "</td>");
        out.println("<td>"+ligg_ro_kg + "</td>");
        out.println("<td>"+ligg_ro_p+ "</td>");
        out.println("<td>"+kneboy_kg + "</td>");
        out.println("<td>"+kneboy_p+ "</td>");
        out.println("</tr>");
    }


    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Resultat Senior");
    }
}

