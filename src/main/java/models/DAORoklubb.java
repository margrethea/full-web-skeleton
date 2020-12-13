package models;

import models.bruker.DropdownRoklubb;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DAORoklubb {


    /**
     * Metode som lager en ny liste for roklubbene fra databsen
     * @param out
     * @return ListRoklubb, Dropdown for roklubbene
     * @throws SQLException
     */
    public List<DropdownRoklubb> list(PrintWriter out) throws SQLException {
        //Lager variabel for en ny Arraylist
        List<DropdownRoklubb> listRoklubb = new ArrayList<>();

        //Conenction ???
        Connection db = null;

        try  {
            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT roklubb.roklubb_id, roklubb.klubbnavn FROM ro.roklubb ORDER BY roklubb.klubbnavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String roklubb_id = result.getString("roklubb_id");
                String klubbnavn = result.getString("klubbnavn");
                DropdownRoklubb roklubb = new DropdownRoklubb(roklubb_id, klubbnavn);
                listRoklubb.add(roklubb);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }

        return listRoklubb;
    }

}
