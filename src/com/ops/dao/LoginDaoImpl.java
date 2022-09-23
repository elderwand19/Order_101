package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ops.model.Customer;
import com.ops.model.Employee;

public class LoginDaoImpl implements LoginDao {

	@Override
	public String customerLogin(String email,String password) {
		//connection to database
		String url="";
		String query = "Select password from (tablename) where uemail="+email+"";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url);
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery(query);
			while(rs.next()) {
				if(rs.getString(2)==password) {
					return "Logged in successfully";
				}else {
					return "Can't log in";
				}
			}
			
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	@Override
	public String employeeLogin(String empEmail,String empPassword) {
		String url="";
		String query = "Select password from (tablename) where uemail="+empEmail+"";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url);
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery(query);
			while(rs.next()) {
				if(rs.getString(2)==empPassword) {
					return "Logged in employee successfully";
				}else {
					return "Can't log in employee";
				}
			}
			
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

}
