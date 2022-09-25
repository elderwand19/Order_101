package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class OrderDetails {
	public void getOrderDetails() throws ClassNotFoundException, SQLException {
		
        String jdbcURL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
        String dbUser = "root";
        String dbPassword = "sql5188";
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT order_id,customerId,order_value,status FROM orders";
        PreparedStatement statement = connection.prepareStatement(sql);
       
        ResultSet result = statement.executeQuery();
        ResultSetMetaData rsmd = result.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (result.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = result.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
		
        
}
}
