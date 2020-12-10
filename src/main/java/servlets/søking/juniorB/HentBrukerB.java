package servlets.søking.juniorB;


import models.Query.QuerysB;
import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.DbTool;
import tools.repository.SearchRepo;
import tools.repository.SearchRepoB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "HentBrukerB", urlPatterns = "/HentBrukerB")
public class HentBrukerB extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out){

        Tabell.skrivTabellB(out);

        SearchRepoB.søkAlleResultatB(out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hent bruker B");
    }

}
