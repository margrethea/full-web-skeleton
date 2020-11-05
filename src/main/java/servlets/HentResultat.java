package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "HentResultat", urlPatterns = "/HentResultat")
public class HentResultat extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        String a = req.getParameter("Utøver");
        String b = req.getParameter("Periode");
        String c = req.getParameter("Kjønn");
        String d = req.getParameter("Øvelse");
        String e = req.getParameter("Årstall");

        if(a != "" && b.equals(null) && c.equals(null) && d.equals(null) && e.equals(null)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn");
            requestDispatcher.forward(req,res);
        }else {
            RequestDispatcher rd = req.getRequestDispatcher("HentBrukerS");
            rd.forward(req,res);
        }

    }


    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String a = req.getParameter("Utøver");
        String b = req.getParameter("Periode");
        String c = req.getParameter("Kjønn");
        String d = req.getParameter("Øvelse");
        String e = req.getParameter("Årstall");

        if(a != null && b.equals(null) && c.equals(null) && d.equals(null) && e.equals(null)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn");
            requestDispatcher.forward(req,res);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("HentBrukerS");
            rd.forward(req,res);
        }
    }
}
