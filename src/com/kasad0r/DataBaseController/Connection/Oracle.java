package com.kasad0r.DataBaseController.Connection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Getter
@Setter
@AllArgsConstructor
public class Oracle {
    private String userName;
    private String password;
    private String hostName;
    private String port;
    private String dbName;

    Connection getConnection() {
        Connection dbConnection = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@" + hostName + ":" + port + ":" + dbName, userName, password);
            return dbConnection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return dbConnection;
    }
}
