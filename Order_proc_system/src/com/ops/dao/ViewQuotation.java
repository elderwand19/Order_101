package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ViewQuotation {
	public void viewAllQuot() throws ClassNotFoundException, SQLException{

        String jdbcURL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
        String dbUser = "root";
        String dbPassword = "sql5188";
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT order_id,order_date,customerId,order_value,status FROM orders WHERE status='pending' ";
        PreparedStatement stat = connection.prepareStatement(sql);
        
        ResultSet result = stat.executeQuery();
        ResultSetMetaData rsmd = result.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (result.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = result.getString(i);
                System.out.print( rsmd.getColumnName(i)+ " " +columnValue + " " );
            }
            System.out.println("");
        }
       
	}
}
