package servlets.registering;

import models.øvelse.ØvelseAModell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorA", urlPatterns = {"/JuniorA"})
public class JuniorA extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String bevegelighet = req.getParameter("bevegelighet");
        String femtusenW = req.getParameter("5000m_w");
        String femtusenT = req.getParameter("5000m_t");
        String totusenW = req.getParameter("2000m_w");
        String totusenT = req.getParameter("2000m_t");
        String liggendeRoingKG = req.getParameter ("ligg_ro_kg");
        String liggendeRoingP = req.getParameter("ligg_ro_p");
        String sargeant = req.getParameter("sargeant");
        int brukerid = Integer.parseInt(req.getParameter("ListUtøver"));
        int testperiode = Integer.parseInt(req.getParameter("testperiode"));

        System.out.println(seksti + bevegelighet + femtusenT+ femtusenW + totusenT + totusenW + liggendeRoingKG + liggendeRoingP +sargeant + brukerid + testperiode);


        ØvelseAModell reqResultat = new ØvelseAModell(testperiode,brukerid,seksti,bevegelighet,femtusenW,femtusenT,
                totusenW,totusenT,liggendeRoingKG,liggendeRoingP,sargeant);
            Øvelserepo.regResultatA(reqResultat, out);

        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i Junior A: </h2>");
        out.println("<div class='tabellcss'>");
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
        out.println("<td><b>Sargeant</b></td>");
        out.println("</tr>");


        out.println("<tr>");
        out.println("<td>"+ brukerid +"</td>");
        out.println("<td>2020</td>");
        out.println("<td>"+testperiode+ "</td>");
        out.println("<td>"+seksti+ "</td>");
        out.println("<td>"+bevegelighet+ "</td>");
        out.println("<td>"+femtusenW+ "</td>");
        out.println("<td>"+femtusenT + "</td>");
        out.println("<td>"+totusenW+ "</td>");
        out.println("<td>"+totusenT+ "</td>");
        out.println("<td>"+liggendeRoingKG + "</td>");
        out.println("<td>"+liggendeRoingP+ "</td>");
        out.println("<td>"+sargeant + "</td>");
        out.println("</tr>");
    }



    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    //public void doPost(HttpServletRequest request, HttpServletResponse response)
   //         throws ServletException, IOException {
    //    writeResponse(request, response, "Added to database");
   // }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}