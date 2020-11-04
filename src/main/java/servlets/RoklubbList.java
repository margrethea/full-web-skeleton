package servlets;

import jdk.jfr.Category;
import models.DAORoklubb;
import models.DropdownRoklubb;

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



@WebServlet(name = "RoklubbList", urlPatterns = {"/RoklubbList"})
public class RoklubbList extends HttpServlet {
    // er det httpservlet vi skal extrende til eller abstract?
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAORoklubb dao = new DAORoklubb();
        PrintWriter out = response.getWriter();

        try {
            List<DropdownRoklubb> listRoklubb = dao.list(out);
            listRoklubb.add((new DropdownRoklubb("1","2")));
            request.setAttribute("listRoklubb", listRoklubb);
            System.out.println(listRoklubb);

            RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-senior.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //int brukerId = Integer.parseInt(request.getParameter("Utøverliste"));

        //request.setAttribute("SelectedBrukerId", brukerId);

    }
    // Hva betyr dette ? O_O
}

