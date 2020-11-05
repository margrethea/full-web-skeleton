package servlets;

import jdk.jfr.Category;
import models.DAOUtøver;
import models.DropdownBruker;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "UtøverList", urlPatterns = {"/UtøverList"})
public class UtøverList extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOUtøver dao = new DAOUtøver();
        PrintWriter out = response.getWriter();

        String user = (String) request.getAttribute("user");

        try {
            List<DropdownBruker> listUtøver = dao.list(out);
           listUtøver.add((new DropdownBruker("1","2","3")));
           request.setAttribute("listUtøver", listUtøver);
            System.out.println(listUtøver);

            if (user.equals("Senior")){
                RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-senior.jsp");
                dispatcher.forward(request, response);
            }

            else if (user.equals("JuniorA")){
                RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-juniorA.jsp");
                dispatcher.forward(request, response);
            }
             else if (user.equals("JuniorB")){
                 RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-juniorB.jsp");
                 dispatcher.forward(request, response);
             }
              else if(user.equals("JuniorC")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("registrer-juniorC.jsp");
                dispatcher.forward(request, response);
            }
             /* else if(user.equals("HentPåFornavn")){
                  RequestDispatcher dispatcher = request.getRequestDispatcher("resultatsøk-senior.jsp");
                  dispatcher.forward(request, response);
              }
              else if(user.equals("HentbrukerS")){
                  RequestDispatcher dispatcher = request.getRequestDispatcher("resultatsøk-senior.jsp");
                  dispatcher.forward(request, response);

            }*/


        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //int brukerId = Integer.parseInt(request.getParameter("Utøverliste"));

        //request.setAttribute("SelectedBrukerId", brukerId);

    }
         // Hva betyr dette ? O_O
    }
