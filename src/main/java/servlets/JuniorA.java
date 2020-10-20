package servlets;

import models.ØvelseAModell;
import tools.repository.Øvelserepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JuniorA", urlPatterns = {"/JuniorA"})
public class JuniorA extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String bevegelighet = req.getParameter("bevegelighet");
        String femtusenW = req.getParameter("5000m_w");
        String femtusenT = req.getParameter("5000m_t");
        String totusenW = req.getParameter("2000m_w");
        String totusenT = req.getParameter("2000m_t");
        String liggendeRoingP = req.getParameter ("ligg_ro_p");
        String liggendeRoingKG = req.getParameter("ligg_ro_kg");
        String sargeant = req.getParameter("sargeant");
        System.out.println(seksti + bevegelighet + femtusenW + femtusenT +
                totusenW + totusenT + liggendeRoingP + liggendeRoingKG + sargeant);

        ØvelseAModell reqResultat = new ØvelseAModell(seksti,bevegelighet,femtusenW,femtusenT,
                totusenW,totusenT,liggendeRoingP,liggendeRoingKG,sargeant);
            Øvelserepo.regResultatA(reqResultat, out);

            out.format("<h1> %s Has been added to the database with id: %s</h1>", seksti);
    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Added to database");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}