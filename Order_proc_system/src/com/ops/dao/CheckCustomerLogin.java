package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ops.model.Customer;

public class CheckCustomerLogin implements CustomerLogin{

	@Override
	public Customer checkCustomerLogin(int cusId, String pswd) throws ClassNotFoundException, SQLException {
		Customer c = new Customer();
		String jdbcURL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
        String dbUser = "root";
        String dbPassword = "sql5188";
 
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT customerId,password FROM customer WHERE customerId = ? and password =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, cusId);
        statement.setString(2, pswd);
       
        ResultSet result = statement.executeQuery();
        
        if(result.next()==true){
        	System.out.println("authentication is successful");
        	return c;
        }
        else{
        	System.out.println("authentication failed");
        	return null;
        }
	}

}
