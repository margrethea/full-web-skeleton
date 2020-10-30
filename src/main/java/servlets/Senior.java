package servlets;

import tools.repository.Øvelserepo;
import models.ØvelseSmodell;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Senior", urlPatterns = {"/servlets.Senior"})
public class Senior extends AbstractAppServlet {



    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String seksti = req.getParameter("60");
        String beveglighet = req.getParameter("bevegelighet");
        String femtusenw = req.getParameter("5000m_w");
        String femtusent = req.getParameter("5000m_t");
        String totusenw = req.getParameter("2000m_w");
        String totusent = req.getParameter("2000m_t");
        String ligg_ro_p = req.getParameter("ligg_ro_p");
        String ligg_ro_kg = req.getParameter("ligg_ro_kg");
        String kneboy_p = req.getParameter("kneboy_p");
        String kneboy_kg = req.getParameter("kneboy_kg");
        int brukerid = Integer.parseInt(req.getParameter("ListUtøver"));
        int testperiode = Integer.parseInt(req.getParameter("testperiode"));



        ØvelseSmodell regResultat = new ØvelseSmodell(testperiode,brukerid,seksti,beveglighet,femtusenw,femtusent,totusenw,totusent,ligg_ro_p,ligg_ro_kg,kneboy_p,kneboy_kg);
        Øvelserepo.regResultatS(regResultat, out);
        System.out.println(regResultat);

        out.format("<h1> %s Has been added to the database with id: %s</h1>", seksti, brukerid);

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

