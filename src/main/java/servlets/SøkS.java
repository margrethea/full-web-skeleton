package servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="SøkS", urlPatterns = "/SøkS")
public class SøkS extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", "HentPåFornavn");
        RequestDispatcher rd = req.getRequestDispatcher("UtøverList");
        rd.forward(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", "HentPåFornavn");
        RequestDispatcher rd = req.getRequestDispatcher("UtøverList");
        rd.forward(req,resp);
    }
}
