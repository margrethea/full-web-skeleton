package models;

import models.bruker.DropdownRoklubb;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAORoklubb {
    String databaseURL = "jdbc:mariadb://172.17.0.1:3308/ro";
    String user = "root";
    String password = "12345";

    public List<DropdownRoklubb> list(PrintWriter out) throws SQLException {
        List<DropdownRoklubb> listRoklubb = new ArrayList<>();
        Connection db = null;

        try  {
            // over, skal vi bruke "db=null" greiene isteden for det som står?
            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT roklubb.roklubb_id, roklubb.klubbnavn FROM ro.roklubb ORDER BY roklubb.klubbnavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String roklubb_id = result.getString("roklubb_id");
                String klubbnavn = result.getString("klubbnavn");
                DropdownRoklubb roklubb = new DropdownRoklubb(roklubb_id, klubbnavn);

                //SE OVER. DET ER NOE FEIL ved "= new Category". Se feilmeilding om at "category er abstrakt".

                listRoklubb.add(roklubb);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
            //skal vi bruke trym sin catch her?
        }

        return listRoklubb;
    }

}
