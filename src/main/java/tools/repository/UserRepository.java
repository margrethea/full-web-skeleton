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


    public static String getBruker(String fornavn, PrintWriter p) {
        Connection db = null;
        PreparedStatement prepareStatement = null;

        String toReturn = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ResultSet rs = null;
            String query = "SELECT * FROM roklubb.bruker WHERE fornavn = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, fornavn);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("fornavn");
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return toReturn;

    }
}