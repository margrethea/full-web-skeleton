package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String brukernavn = request.getParameter("brukernavn");
        String passord = request.getParameter("passord");

        if (brukernavn.equals("Admin") && passord.equals("123")) {
            response.sendRedirect("index.jsp");

        } else if (brukernavn.equals("Trener") && passord.equals("123")) {
            response.sendRedirect("index.jsp");

        } else if (brukernavn.equals("Utøver") && passord.equals("123")) {
            response.sendRedirect("");
        }

    }
}

