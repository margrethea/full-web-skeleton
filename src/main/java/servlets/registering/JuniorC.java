package servlets.registering;

import models.øvelse.ØvelseCModell;
import servlets.tryms.AbstractAppServlet;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorC", urlPatterns = {"/JuniorC"})
public class JuniorC extends AbstractAppServlet {



    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
      String seksti = req.getParameter("60");
      String beveglighet = req.getParameter("bevegelighet");
      String kroppshev = req.getParameter("kroppshev");
      String sargeant = req.getParameter("sargeant");
      String tretusen = req.getParameter("3000m");
      int brukerid = Integer.parseInt(req.getParameter("ListUtøver"));
      int testperiode = Integer.parseInt(req.getParameter("testperiode"));


      ØvelseCModell regResultat = new ØvelseCModell(testperiode,brukerid,seksti,beveglighet,kroppshev,sargeant,tretusen);
        Øvelserepo.regResultatJC(regResultat, out);
        System.out.println(regResultat);
        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2>Registrerte Resultat for Junior C </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>BrukerID</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>Kroppshev</b></td>");
        out.println("<td><b>Sargeant</b></td>");
        out.println("<td><b>3000m</b></td>");
        out.println("</tr>");


        out.println("<tr>");
        out.println("<td>"+ brukerid +"</td>");
        out.println("<td>2020</td>");
        out.println("<td>"+testperiode+ "</td>");
        out.println("<td>"+seksti+ "</td>");
        out.println("<td>"+beveglighet+ "</td>");
        out.println("<td>"+kroppshev+ "</td>");
        out.println("<td>"+sargeant+ "</td>");
        out.println("<td>"+tretusen+ "</td>");

        out.println("</tr>");
    }



    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "HEIHEI");
    }
    


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}

