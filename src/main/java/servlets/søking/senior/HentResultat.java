package servlets.søking.senior;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @WebServlet
 * Serlvet som sender deg til riktig klasse avhengig av input
 * på nettsiden
 */
@WebServlet(name = "HentResultat", urlPatterns = "/HentResultat")
public class HentResultat extends HttpServlet {




    /**
     * Metoden Sjekker hva brukeren har tastet inn i inputfeltet
     * Sender videre til riktig servlet basert på dette
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String a = req.getParameter("fornavn");
        String b = req.getParameter("etternavn");
        String c = req.getParameter("periode");
        String d = req.getParameter("gender");
        String e = req.getParameter("year");
        // String f = req.getParameter("roklubb");
        System.out.println(a + b + c + d + e);
        if (a.equals("") && b.equals("") && c.equals("Periode") && d.equals("Gender") && e.equals("Year")/** && f.equals("")**/) {
            System.out.println("IFIF");
            RequestDispatcher rd = req.getRequestDispatcher("HentBrukerS");
            rd.forward(req, res);

        }else if (!(a.equals("") || b.equals("") || c.equals("Periode") || d.equals("Gender") || e.equals("Year") /**|| f.equals("")**/)) {

            System.out.println("ELSEELSE");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AlleParametre");
            requestDispatcher.forward(req, res);

        }else if (!(a.equals("") || b.equals("")/** || f.equals("")*/))  {
            System.out.println("tjohei hvor det går");
            RequestDispatcher rd = req.getRequestDispatcher("KlubbFornavnEtternavn");
            rd.forward(req,res);
        }
        else if (!(a.equals("") || b.equals( ""))){
            System.out.println("ToParametre");
            RequestDispatcher rd = req.getRequestDispatcher("ToParametre");
            rd.forward(req,res);

        }else if (!(b.equals("") || d.equals("Gender"))){
        System.out.println("Kjønn og etternavn");
        RequestDispatcher rd = req.getRequestDispatcher("HentEtternavnKjønn");
        rd.forward(req, res);

        }else if(!(d.equals("Gender") /**|| f.equals("")*/)){
            System.out.println("klubb og kjønn");
            RequestDispatcher rd = req.getRequestDispatcher("HentKlubbKjønn");
            rd.forward(req,res);
        }
        else if(a != "" && b != "" && c != "Periode" && d != "Gender" && e != "Year"/** && f != ""*/) {
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
            }else if(!(d.equals("Gender"))){
                System.out.println("kjønn");
                RequestDispatcher rd = req.getRequestDispatcher("HentKjønn");
                rd.forward(req,res);
            }else if (!(e.equals("Year"))){
                System.out.println("år");
                RequestDispatcher rd = req.getRequestDispatcher("HentÅr");
                rd.forward(req,res);
          /**  }else if (!(f.equals(""))){
                System.out.println("roklubb");
                RequestDispatcher rd = req.getRequestDispatcher("HentKlubb");
                rd.forward(req,res);
            }**/
        }
        }
    }
}



