package tools.repository;

import tools.DbTool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    /**
     * henter ut spesifikk person fra databasen
     * @param username brukerens epost-addresse ("trym@example.com");
     * @param p printwriter see metoden over.
     * @return et String objekt med eposten til brukeren.
     */

    public static String getUserName(String username, PrintWriter p) {
        Connection db = null;
        PreparedStatement prepareStatement = null;

        String toReturn = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ResultSet rs = null;
            String query = "SELECT * FROM otra.user where User_Email = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, username);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("User_Email");
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return toReturn;

    }


   /* public static String getBruker(PrintWriter p) {
        Connection db = null;
        //PreparedStatement prepareStatement = null;
        String query = null;
       // String toReturn = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);

            PreparedStatement st = db.prepareStatement("select epost, fornavn, etternavn from ro.bruker");
            ResultSet r1 = st.executeQuery();
            int count = 0;
            while(r1.next()) {
                System.out.println(count);
                query = r1.getString("fornavn") + " " + r1.getString("etternavn") + " " + r1.getString("epost");
                count = count + 1;


            }
           /* ResultSet rs = null;
            String query = "SELECT * FROM ro.bruker WHERE fornavn = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, fornavn);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("epost");
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return query;
    }*/
}