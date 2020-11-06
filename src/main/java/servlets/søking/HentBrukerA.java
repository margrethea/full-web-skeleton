package servlets.søking;

import models.Query.QuerysA;
import servlets.tryms.AbstractAppServlet;
import tools.DbTool;

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

@WebServlet(name = "HentBrukerA", urlPatterns = "/HentBrukerA")
public class HentBrukerA extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        Connection db = null;
        //PreparedStatement prepareStatement = null;
        String query = null;
        // String toReturn = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(out);

            // SELECT salesman.name AS "Salesman",//customer.cust_name, customer.city
            //FROM salesman,customer
            // WHERE salesman.city=customer.city;

            PreparedStatement st = db.prepareStatement(QuerysA.alleResultat(query));
            ResultSet r1 = st.executeQuery();


            out.println("<html><head><link rel='stylesheet' href='main.css'></head><body><h2> Resultat av søk i Junior A: </h2>");
            out.println("<div class='tabellcss'>");
            out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
            out.println("<tr>");
            out.println("<td><b>Fornavn</b></td>");
            out.println("<td><b>År</b></td>");
            out.println("<td><b>Testperiode</b></td>");
            out.println("<td><b>60w</b></td>");
            out.println("<td><b>Bevegelighet</b></td>");
            out.println("<td><b>5000 watt</b></td>");
            out.println("<td><b>5000 tid</b></td>");
            out.println("<td><b>2000 watt</b></td>");
            out.println("<td><b>2000 tid</b></td>");
            out.println("<td><b>Liggende Roing kg</b></td>");
            out.println("<td><b>Liggende Roing prosent</b></td>");
            out.println("<td><b>Sargeant </b></td>");
            out.println("<td><b>Toppscore</b></td>");
            out.println("</tr></div>");

            out.println("<a href=resultatsøk.jsp>Tilbake til resultat</a>");

            while (r1.next()) {
                //  query = r1.getString("fornavn") + " " + r1.getString("etternavn") + " " + r1.getString("epost") + " " + r1.getString("60w");
                out.println("<tr>");
                out.println("<td>" + r1.getString("fornavn") + "</td>");
                out.println("<td>" + r1.getString("år") + "</td>");
                out.println("<td>" + r1.getString("periode") + "</td>");
                out.println("<td>" + r1.getString("60w") + "</td>");
                out.println("<td>" + r1.getString("bevegelighet") + "</td>");
                out.println("<td>" + r1.getString("5000w") + "</td>");
                out.println("<td>" + r1.getString("5000t") + "</td>");
                out.println("<td>" + r1.getString("2000w") + "</td>");
                out.println("<td>" + r1.getString("2000t") + "</td>");
                out.println("<td>" + r1.getString("ligg_ro_kg") + "</td>");
                out.println("<td>" + r1.getString("ligg_ro_p") + "</td>");
                out.println("<td>" + r1.getString("sargeant") + "</td>");
                out.println("<td>" + r1.getString("toppscore") + "</td>");
                out.println("</tr>");

                // out.format(query);
            }
            r1.close();
           /* ResultSet rs = null;
            String query = "SELECT * FROM ro.bruker WHERE fornavn = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, fornavn);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("epost");
            }
            r1.close() */

        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    // String fornavn = req.getParameter("bruker");
    //String skrivUt = UserRepository.getBruker(out);
    //out.format("<h1> Here is your request: %s</h1", skrivUt);
    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hent bruker A");
    }
}
