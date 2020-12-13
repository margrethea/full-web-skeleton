package servlets.søking;

import servlets.tryms.AbstractAppServlet;
import tools.repository.ToppScoreRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HentToppScore", urlPatterns = "/HentToppScore")
public class HentToppScore extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Toppscore senior : </h2>");
        out.println("<div class='tabellcss'>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Menn</b></td>");
        out.println("<td><b></b></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td><b>Plassering</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("</tr>");



        ToppScoreRepo.VisToppScoreMenn(out);

        out.println("<tr>");
        out.println("<td><b></b></td>");
        out.println("<td><b></b></td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td><b>Kvinner</b></td>");
        out.println("<td><b></b></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td><b>Plassering</b></td>");
        out.println("<td><b>Toppscore</b></td>");
        out.println("</tr>");

        ToppScoreRepo.VisToppScoreKvinner(out);

        out.println("<a href=toppscore_test.jsp>Tilbake til toppscore</a>");




    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }





}
