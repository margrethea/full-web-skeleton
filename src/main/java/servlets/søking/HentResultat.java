package servlets.søking;

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
        String a = req.getParameter("fornavn");
        String b = req.getParameter("Periode");
        String c = req.getParameter("Kjønn");
        String d = req.getParameter("Øvelse");
        String e = req.getParameter("Årstall");
        System.out.println(a + b + c + d + e);
        if (b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty()) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn");
            requestDispatcher.forward(req, res);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("HentBrukerS");
            rd.forward(req, res);
        }

    }


    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String a = req.getParameter("fornavn");
        String b = req.getParameter("etternavn");
        String c = req.getParameter("periode");
        String d = req.getParameter("gender");
        String e = req.getParameter("year");
        System.out.println(a + b + c + d + e);
        if (a.equals("") && b.equals("") && c.equals("Periode") && d.equals("Gender") && e.equals("Year")) {
            System.out.println("IFIF");
            RequestDispatcher rd = req.getRequestDispatcher("HentBrukerS");
            rd.forward(req, res);

        }else if (!(a.equals("") || b.equals("") || c.equals("Periode") || d.equals("Gender") || e.equals("Year"))) {

            System.out.println("ELSEELSE");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AlleParametre");
            requestDispatcher.forward(req, res);

        }else if(a != "" && b != "" && c != "Periode" && d != "Gender" && e != "Year") {
            if(!(a.equals(""))) {
                System.out.println("Funker den statementen her i det heletatt?");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn");
                requestDispatcher.forward(req, res);
            }else if(!(b.equals(""))){
                System.out.println("etternavn");
                RequestDispatcher rd = req.getRequestDispatcher("HentEtternavn");
                rd.forward(req,res);
            }else if(!(c.equals("Periode"))){
                System.out.println("periode");
                RequestDispatcher rd = req.getRequestDispatcher("HentPeriode");
                rd.forward(req,res);
            }
        }
        }
    }



