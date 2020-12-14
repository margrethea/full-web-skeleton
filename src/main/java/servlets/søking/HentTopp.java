package servlets.søking;

import servlets.tryms.AbstractAppServlet;
import tools.repository.ToppRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HentTopp", urlPatterns = "/HentTopp")
public class HentTopp extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i senior : </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>5000mean</b></td>");
        out.println("<td><b>5000sd</b></td>");
        out.println("<td><b>2000mean</b></td>");
        out.println("<td><b>2000sd</b></td>");
        out.println("<td><b>60mean</b></td>");
        out.println("<td><b>60sd</b></td>");
        out.println("<td><b>ligg_ro_mean</b></td>");
        out.println("<td><b>ligg_ro_sd</b></td>");
        out.println("<td><b>kneboymean</b></td>");
        out.println("<td><b>kneboysd</b></td>");
        out.println("<td><b>bevegmean</b></td>");
        out.println("<td><b>bevegsd</b></td>");

        out.println("<td><b>5000wrw</b></td>");
        out.println("<td><b>2000wrw</b></td>");
        out.println("<td><b>60wrw</b></td>");
        out.println("<td><b>ligg_rorw</b></td>");
        out.println("<td><b>kneboyrw</b></td>");
        out.println("<td><b>bevegelighetrw</b></td>");

        out.println("<td><b>5000w</b></td>");
        out.println("<td><b>2000w</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>ligg_ro</b></td>");
        out.println("<td><b>kneboy</b></td>");
        out.println("<td><b>bevegelighet</b></td>");



        out.println("<td><b>5000w_step1</b></td>");
        out.println("<td><b>2000w_step1</b></td>");
        out.println("<td><b>60w_step1</b></td>");
        out.println("<td><b>ligg_ro_step1</b></td>");
        out.println("<td><b>knebøy_step1</b></td>");
        out.println("<td><b>bevegelighet_step1</b></td>");
        out.println("<td><b>sum_step1</b></td>");
        out.println("<td><b>sum</b></td>");

        out.println("</tr>");

        out.println("<a href=resultatsøk-senior.jsp>Tilbake til resultat</a>");

        ToppRepo.søkAlleResultatS(out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }





}
