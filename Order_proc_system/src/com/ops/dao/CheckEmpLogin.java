package com.ops.dao;

import java.sql.*;

import com.ops.model.Employee;

public class CheckEmpLogin implements Login{

	@Override
	public Employee checkEmpLogin(int empId, String pswd) throws ClassNotFoundException, SQLException {
			Employee e = new Employee();
	        String jdbcURL = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";
	        String dbUser = "root";
	        String dbPassword = "sql5188";
	 
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	        String sql = "SELECT employeeId,password FROM employee WHERE employeeId = ? and password =?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, empId);
	        statement.setString(2, pswd);
	       
	        ResultSet result = statement.executeQuery();
	        
	        if(result.next()==true){
	        	System.out.println("authentication is successful");
	        	e.setEmployeeId(empId);
	        	e.setPswd(pswd);
	        	return e;
	        }
	        else{
	        	System.out.println("authentication failed");
	        	return null;
	        }
	        }
	        
	}
		

	



