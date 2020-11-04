package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JuniorBDD", urlPatterns = "/JuniorBDD")
public class JuniorBDD extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user","JuniorB");
        RequestDispatcher rd = request.getRequestDispatcher("UtøverList");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user","JuniorB");
        RequestDispatcher rd = request.getRequestDispatcher("UtøverList");
        rd.forward(request,response);
    }
}
