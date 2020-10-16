package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Senior", urlPatterns = "/servlets.Senior")
public class Senior extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String fnavn = request.getParameter("fornavn");
        String enavn = request.getParameter("etternavn");
        String options = request.getParameter("option");
        String gender = null;
        if(options.equals("Kvinne")){
            gender = "Kvinne";
            out.println("<h1> Hello Big Tiddy Ma </h1>");
            System.out.println("Kvinne");
        } else{
            gender = "Mann";
            System.out.println("Mann");
        }
        System.out.println(fnavn + enavn);
        out.println(fnavn);
    }
}
