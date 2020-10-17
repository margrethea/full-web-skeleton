package servlets;

import models.ØvelseCModell;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorC", urlPatterns = {"/JuniorC"})
public class JuniorC extends AbstractAppServlet {



    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
      String seksti = req.getParameter("60");
      String beveglighet = req.getParameter("bevegelighet");
      String kroppshev = req.getParameter("kroppshev");
      String sargeant = req.getParameter("sargeant");
      String tretusen = req.getParameter("3000m");
      System.out.println(seksti + beveglighet + kroppshev + sargeant + tretusen);


      ØvelseCModell regResultat = new ØvelseCModell(seksti,beveglighet,kroppshev,sargeant,tretusen);
        Øvelserepo.regResultatJC(regResultat, out);

        out.format("<h1> %s Has been added to the database with id: %s</h1>", seksti);

    }


    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "HEIHEI");
    }
    


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}

