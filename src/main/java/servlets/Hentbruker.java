package servlets;

import tools.DbTool;
import tools.repository.UserRepository;

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
import java.util.ArrayList;

@WebServlet(name = "Hentbruker", urlPatterns = {"/Hentbruker"})
public class Hentbruker extends AbstractAppServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }
    @Override
     protected void writeBody(HttpServletRequest req, PrintWriter out) {

            Connection db = null;
            //PreparedStatement prepareStatement = null;
            String query = null;
            // String toReturn = null;
            try {
                db = DbTool.getINSTANCE().dbLoggIn(out);

                PreparedStatement st = db.prepareStatement("select epost, fornavn, etternavn from ro.bruker");
                ResultSet r1 = st.executeQuery();

                out.println("<html><body><h2>The Select query has following results : </h2>");
                out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
                out.println("<tr>");
                out.println("<td><b>First Name</b></td>");
                out.println("<td><b>Last Name</b></td>");
                out.println("<td><b>Email</b></td>");
                out.println("</tr>");

                int count = 0;
                while(r1.next()) {
                    System.out.println(count);
                   // query = r1.getString("fornavn") + " " + r1.getString("etternavn") + " " + r1.getString("epost");
                    count = count + 1;
                    out.println("<tr>");
                    out.println("<td>"+r1.getString(2) + "</td>");
                    out.println("<td>"+r1.getString(3) + "</td>");
                    out.println("<td>"+r1.getString(1) + "</td>");
                    out.println("</tr>");

                    //out.format(query);
                }
           /* ResultSet rs = null;
            String query = "SELECT * FROM ro.bruker WHERE fornavn = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, fornavn);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("epost");
            }
            rs.close();*/

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }



        // String fornavn = req.getParameter("bruker");
         //String skrivUt = UserRepository.getBruker(out);
         //out.format("<h1> Here is your request: %s</h1", skrivUt);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
