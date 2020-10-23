package models;

import jdk.jfr.Category;
import servlets.UtøverList;
import tools.DbTool;

import javax.print.DocFlavor;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOUtøver {
    String databaseURL = "jdbc:mariadb://172.17.0.1:3308/ro";
    String user = "root";
    String password = "12345";

    public List<DropdownBruker> list() throws SQLException {
        List<DropdownBruker> listUtøver = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
            // over, skal vi bruke "db=null" greiene isteden for det som står?
            String sql = "SELECT bruker.fornavn, bruker.etternavn FROM ro.bruker ORDER BY bruker.fornavn";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                int bruker_id = result.getInt("bruker_id");
                String fornavn = result.getString("fornavn");
                String etternavn = result.getString("etternavn");
                DropdownBruker utøver = new DropdownBruker(bruker_id, fornavn, etternavn);

                //SE OVER. DET ER NOE FEIL ved "= new Category". Se feilmeilding om at "category er abstrakt".

                listUtøver.add(utøver);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
            //skal vi bruke trym sin catch her?
        }

        return listUtøver;
    }

}