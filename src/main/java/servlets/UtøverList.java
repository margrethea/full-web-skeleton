package servlets;

import jdk.jfr.Category;
import models.DAOUtøver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "UtøverList", urlPatterns = {"/UtøverList"})
public class UtøverList extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UtøverList(request, response);

    }
    private void UtøverList (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOUtøver dao = new DAOUtøver();

        try {
            List<Category> listUtøver = dao.list();
            request.setAttribute("listUtøver", listUtøver);

            RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-juniorC.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int brukerId = Integer.parseInt(request.getParameter("Utøverliste"));

        request.setAttribute("SelectedBrukerId", brukerId);

    }


}