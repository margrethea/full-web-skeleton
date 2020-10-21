package servlets;


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

@WebServlet(name = "HentBrukerC", urlPatterns = "/HentBrukerC")
public class HentBrukerC extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out){
    Connection db = null;
    //PreparedStatement prepareStatement = null;
    String query = null;
    // String toReturn = null;
            try {
        db = DbTool.getINSTANCE().dbLoggIn(out);

        // SELECT salesman.name AS "Salesman",//customer.cust_name, customer.city
        //FROM salesman,customer
        // WHERE salesman.city=customer.city;

        PreparedStatement st = db.prepareStatement("select bruker.fornavn, c_resultat.år, c_resultat.periode, c_resultat.60w, c_resultat.bevegelighet, c_resultat.3000m, c_resultat.kroppshev, c_resultat.sargeant FROM ro.bruker, ro.c_resultat WHERE c_resultat.bruker_id=bruker.bruker_id;");
        ResultSet r1 = st.executeQuery();

        out.println("<html><body><h2>The Select query has following results : </h2>");
        out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
        out.println("<tr>");
        out.println("<td><b>Fornavn</b></td>");
        out.println("<td><b>År</b></td>");
        out.println("<td><b>Testperiode</b></td>");
        out.println("<td><b>60w</b></td>");
        out.println("<td><b>Bevegelighet</b></td>");
        out.println("<td><b>3000m</b></td>");
        out.println("<td><b>Kroppshev</b></td>");
        out.println("<td><b>Sargeant</b></td>");
        out.println("</tr>");

        out.println("<a href=resultatsøk.jsp>Tilbake til resultat</a>");

        while(r1.next()) {
            //  query = r1.getString("fornavn") + " " + r1.getString("etternavn") + " " + r1.getString("epost") + " " + r1.getString("60w");
            out.println("<tr>");
            out.println("<td>"+r1.getString("fornavn") + "</td>");
            out.println("<td>"+r1.getString("år") + "</td>");
            out.println("<td>"+r1.getString("periode") + "</td>");
            out.println("<td>"+r1.getString("60w") + "</td>");
            out.println("<td>"+r1.getString("bevegelighet") + "</td>");
            out.println("<td>"+r1.getString("3000m") + "</td>");
            out.println("<td>"+r1.getString("kroppshev") + "</td>");
            out.println("<td>"+r1.getString("sargeant") + "</td>");
            out.println("</tr>");

            // out.format(query);
        } r1.close();
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
        writeResponse(request, response, "Hello!");
    }



}
