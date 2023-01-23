/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.empweb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author itssh
 */
public class JDBCConnectionManager {

    public static Connection getMySQLConnection() {
        Connection connection = null;

        try {
            PropertyFileReader util = PropertyFileReader.getInstance();

            String user = util.getPropertyValue("user");
            String password = util.getPropertyValue("pass");
            String url = util.getPropertyValue("url");
            String dbName = util.getPropertyValue("dbNname");
            String driveName = util.getPropertyValue("driveName");

            // we use use the url, userid and passowrd to ge the connection
            Class.forName(driveName); // loading the call in memory

            connection = DriverManager.getConnection(url + dbName, user, password);

        } catch (ClassNotFoundException | SQLException ex) {

        }

        return connection;

    }
}
