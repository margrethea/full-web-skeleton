package servlets.dropdown;

import models.DAORoklubb;
import models.bruker.DropdownRoklubb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "RoklubbList", urlPatterns = {"/RoklubbList"})
public class RoklubbList extends HttpServlet {

    /**
     *  Metoden henter Fra DAORoklubb og DropdownRoklubb
     *  Deretter skriver den ut roklubbene i form av en dropdown
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAORoklubb dao = new DAORoklubb();
        PrintWriter out = response.getWriter();

        try {
            List<DropdownRoklubb> listRoklubb = dao.list(out);
            listRoklubb.add((new DropdownRoklubb("1","2")));
            request.setAttribute("listRoklubb", listRoklubb);
            System.out.println(listRoklubb);

            RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-bruker.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}

