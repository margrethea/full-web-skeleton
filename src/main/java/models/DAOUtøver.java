package models;

import models.bruker.DropdownBruker;
import tools.DbTool;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Modell som henter metodene for hver av de ulike klassene i Norges Roforbund som henter metoder fra DropDownBruker
 * og returnerer en liste ved hjelp av SQL query
 */

public class DAOUtøver {

    public List<DropdownBruker> listS(PrintWriter out) throws SQLException {
        List<DropdownBruker> listUtøver = new ArrayList<>();
        Connection db = null;

        try  {

            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT bruker.bruker_id, bruker.fornavn, bruker.etternavn FROM ro.bruker WHERE bruker.klasse_id = 1 ORDER BY bruker.fornavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String bruker_id = result.getString("bruker_id");
                String fornavn = result.getString("fornavn");
                String etternavn = result.getString("etternavn");
                DropdownBruker utøver = new DropdownBruker(bruker_id, fornavn, etternavn);
                listUtøver.add(utøver);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }

        return listUtøver;
    }

    public List<DropdownBruker> listA(PrintWriter out) throws SQLException {
        List<DropdownBruker> listUtøver = new ArrayList<>();
        Connection db = null;

        try  {
            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT bruker.bruker_id, bruker.fornavn, bruker.etternavn FROM ro.bruker WHERE bruker.klasse_id = 2 ORDER BY bruker.fornavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String bruker_id = result.getString("bruker_id");
                String fornavn = result.getString("fornavn");
                String etternavn = result.getString("etternavn");
                DropdownBruker utøver = new DropdownBruker(bruker_id, fornavn, etternavn);
                listUtøver.add(utøver);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }

        return listUtøver;
    }

    public List<DropdownBruker> listB(PrintWriter out) throws SQLException {
        List<DropdownBruker> listUtøver = new ArrayList<>();
        Connection db = null;

        try  {
            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT bruker.bruker_id, bruker.fornavn, bruker.etternavn FROM ro.bruker WHERE bruker.klasse_id = 3 ORDER BY bruker.fornavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String bruker_id = result.getString("bruker_id");
                String fornavn = result.getString("fornavn");
                String etternavn = result.getString("etternavn");
                DropdownBruker utøver = new DropdownBruker(bruker_id, fornavn, etternavn);
                listUtøver.add(utøver);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }

        return listUtøver;
    }


    public List<DropdownBruker> listC(PrintWriter out) throws SQLException {
        List<DropdownBruker> listUtøver = new ArrayList<>();
        Connection db = null;

        try  {
            db  = DbTool.getINSTANCE().dbLoggIn(out);
            String sql = "SELECT bruker.bruker_id, bruker.fornavn, bruker.etternavn FROM ro.bruker WHERE bruker.klasse_id = 4 ORDER BY bruker.fornavn";
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String bruker_id = result.getString("bruker_id");
                String fornavn = result.getString("fornavn");
                String etternavn = result.getString("etternavn");
                DropdownBruker utøver = new DropdownBruker(bruker_id, fornavn, etternavn);
                listUtøver.add(utøver);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }

        return listUtøver;
    }
}