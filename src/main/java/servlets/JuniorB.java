package servlets;

import models.UserModel;
import tools.DbTool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "JuniorB")
public class JuniorB extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public static void RegistrerJB (UserModel user, PrintWriter p) {
        Connection db = null;
        PreparedStatement insertNewUser = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                    "INSERT INTO `user` (User_firstName, User_lastName,User_Email, User_password ) values (?,?,?,?)";

            insertNewUser = db.prepareStatement(query);
            insertNewUser.setString(1, user.getFirstName());
            insertNewUser.setString(2, user.getLastName());
            insertNewUser.setString(3, user.getUserName());
            insertNewUser.setString(4, user.getPassword());
            insertNewUser.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                db.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
}
