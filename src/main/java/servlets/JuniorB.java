package servlets;

import models.ØvelseBModell;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorB", urlPatterns = {"/JuniorB"})
public class JuniorB extends AbstractAppServlet {


    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String beveglighet = req.getParameter("bevegelighet");
        String tretusen = req.getParameter("3000m");
        String totusenW = req.getParameter("2000m_w");
        String totusenT = req.getParameter("20000m_t");
        String kroppshev = req.getParameter("kroppshev");
        String sargeant = req.getParameter("sargeant");

        ØvelseJModell regResultat = new ØvelseBModell(seksti, beveglighet, tretusen, totusenW, totusenT, kroppshev, sargeant);
          Øvelserepo.regResultatJB(regResultat, out);

          out.format("<h1> The result %s Has been added to the database with id: %s <h1>", seksti);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        writeResponse(request, response, "Hello, ya dick!");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        writeResponse(request, response, "Heisann sveisann");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
}