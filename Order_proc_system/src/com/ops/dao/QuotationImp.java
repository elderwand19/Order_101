package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ops.model.Order;

public class QuotationImp implements Quotation{

	@Override
	public String createQuotation(Order o) throws ClassNotFoundException, SQLException {
		String result = null;
		String url = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
		String dbUser = "root";
        String dbPassword = "sql5188";
		Connection con=null;
	
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,dbUser, dbPassword);
		String query = "INSERT INTO orders(order_date,customerId,shipping_address,order_value,shipping_cost,status) VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,o.getOrder_date());
		pstmt.setInt(2, o.getId());
		pstmt.setString(3, o.getAddress());
		pstmt.setInt(4, o.getOrder_value());
		pstmt.setInt(5, o.getShipping_cost());
		pstmt.setString(6, o.getStatus());
		
		int status = pstmt.executeUpdate();
		System.out.println(status);
		con.close();
		if(status!=0) {
			result = "Quotation created successfully";
			return result;
		}else {
			result = "Quotation creation failed";
			System.out.println(result);
			return null;
		}
		
		
	}

	
	

}
