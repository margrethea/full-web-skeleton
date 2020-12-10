package servlets.søking.juniorA;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @WebServlet
 * Serlvet som sender deg til riktig klasse avhengig av input
 * på nettsiden
 */
@WebServlet(name = "HentResultat_A", urlPatterns = "/HentResultat_A")
public class HentResultat_A extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String a = req.getParameter("fornavn");
        String b = req.getParameter("Periode");
        String c = req.getParameter("Kjønn");
        String d = req.getParameter("Øvelse");
        String e = req.getParameter("Årstall");
        System.out.println(a + b + c + d + e);
        if (b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty()) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn_A");
            requestDispatcher.forward(req, res);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("HentBruker_A");
            rd.forward(req, res);
        }

    }

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
        String f = req.getParameter("roklubb");
        System.out.println(a + b + c + d + e + f);
        if (a.equals("") && b.equals("") && c.equals("Periode") && d.equals("Gender") && e.equals("Year") && f.equals("")) {

            System.out.println("IFIF");
            RequestDispatcher rd = req.getRequestDispatcher("HentBruker_A");
            rd.forward(req, res);

        }else if (!(a.equals("") || b.equals("") || c.equals("Periode") || d.equals("Gender") || e.equals("Year") || f.equals(""))) {

            System.out.println("ELSEELSE");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AlleParametre_A");
            requestDispatcher.forward(req, res);

        }else if (!(a.equals("") || b.equals( ""))){

            System.out.println("ToParametre");
            RequestDispatcher rd = req.getRequestDispatcher("ToParametre_A");
            rd.forward(req,res);

        }else if (!(b.equals("") || d.equals("Gender"))){
            System.out.println("Kjønn og etternavn");
            RequestDispatcher rd = req.getRequestDispatcher("HentEtternavnKjønn_A");
            rd.forward(req, res);

        }else if(a != "" && b != "" && c != "Periode" && d != "Gender" && e != "Year") {
            if(!(a.equals(""))) {
                System.out.println("Funker den statementen her i det heletatt?");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("HentPåFornavn_A");
                requestDispatcher.forward(req, res);
            }else if(!(b.equals(""))){
                System.out.println("etternavn");
                RequestDispatcher rd = req.getRequestDispatcher("HentEtternavn_A");
                rd.forward(req,res);
            }else if(!(c.equals("Periode"))){
                System.out.println("periode");
                RequestDispatcher rd = req.getRequestDispatcher("HentPeriode_A");
                rd.forward(req,res);
            }else if(!(d.equals("Gender"))){
                System.out.println("kjønn");
                RequestDispatcher rd = req.getRequestDispatcher("HentKjønn_A");
                rd.forward(req,res);
            }else if (!(e.equals("Year"))){
                System.out.println("år");
                RequestDispatcher rd = req.getRequestDispatcher("HentÅr_A");
                rd.forward(req,res);
            }else if (!(f.equals(""))){
                System.out.println("klubb");
                RequestDispatcher rd = req.getRequestDispatcher("HentKlubb");
                rd.forward(req,res);
            }
        }
        }
    }



