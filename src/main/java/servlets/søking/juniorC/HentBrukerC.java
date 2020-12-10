package servlets.søking.juniorC;


import models.Query.QuerysC;
import servlets.søking.Tabell;
import servlets.tryms.AbstractAppServlet;
import tools.DbTool;
import tools.repository.SearchRepoC;

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

@WebServlet(name = "HentBrukerC", urlPatterns = "/HentBrukerC")
public class HentBrukerC extends AbstractAppServlet {

    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out){

        Tabell.skrivTabellC(out);

        SearchRepoC.søkAlleResultatC(out);

    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }



}
