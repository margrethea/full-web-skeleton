package servlets;

import tools.repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Hentbruker", urlPatterns = {"/Hentbruker"})
public class Hentbruker extends AbstractAppServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }
    @Override
     protected void writeBody(HttpServletRequest req, PrintWriter out) {
         String fornavn = req.getParameter("bruker");
         String fornavnFraDb = UserRepository.getBruker(fornavn, out);
         out.format("<h1> Here is your request: %s</h1", fornavnFraDb);

     }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
