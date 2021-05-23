package com.tutorial.singleton.secondSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
* control resource
*  connection db
* runtime,logger
* */
public class DbConnection {

    private static DbConnection dbConnection = null;
    private Connection connection;
    private DbConnection() throws SQLException, ClassNotFoundException {
        initial();
    }

    public Connection getConnection() {
        return connection;
    }

    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        if(dbConnection == null){
            synchronized (DbConnection.class){
                if(dbConnection == null){
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;
    }

    private void initial() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hediyeh", "myjava123");
    }

}
