/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.services;

import com.exavalu.empweb.utils.JDBCConnectionManager;
import com.exavalu.entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author itssh
 */
public class UserService {

    public static boolean doLogin(String emailAddress, String password) {
        boolean result=false;
        
        Connection con=JDBCConnectionManager.getMySQLConnection();
         String sql = "Select * from users where emailAddress=? and password=?";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, emailAddress);
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next())
            {
                result=true;
            }
            con.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return result;


    }

    public static boolean doSignUp(String emailAddress, String password, String firstName, String lastName) {
        boolean result=false;
        
        Connection con=JDBCConnectionManager.getMySQLConnection();
         String sql = "INSERT INTO employeedb.users (emailAddress, password, firstName, lastName, status) VALUES (?, ?, ?, ?, ?);";

        try {
            //System.out.println("entering try block");
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, emailAddress);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, lastName);
            preparedStatement.setInt(5, 1);
            

            preparedStatement.executeUpdate();

           
                result=true;
            
            //con.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return result;

//To change body of generated methods, choose Tools | Templates.
    }

    public static User getUser(String emailAddress) {
        User user= new User();
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "Select * from users where emailAddress=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, emailAddress);

            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next())
            {

                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
            }

        } catch (SQLException ex) {

        }

        return user;
    }
}
        


