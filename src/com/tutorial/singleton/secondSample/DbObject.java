package com.tutorial.singleton.secondSample;

import java.sql.*;

/*
* singleton  in contrast of factory
* */
public class DbObject {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DbConnection dbConnection = DbConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        System.out.println(dbConnection.getConnection()+"---create-----"+connection);

        //create,insert,fetch
        try(PreparedStatement preparedStatement = connection.prepareStatement("create table product1 (name nvarchar2(15))")){
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }

        DbConnection dbConnection1 = DbConnection.getInstance();
        Connection connection1 = dbConnection1.getConnection();
        System.out.println(dbConnection.getConnection()+"----insert----"+connection);

        try(PreparedStatement preparedStatement = connection1.prepareStatement("insert into product1 values('test')")){
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }

        DbConnection dbConnection2 = DbConnection.getInstance();
        Connection connection2 = dbConnection2.getConnection();
        System.out.println(dbConnection2.getConnection()+"----fetch----"+connection2);
        try(PreparedStatement preparedStatement = connection2.prepareStatement("select * from product1 ")){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
