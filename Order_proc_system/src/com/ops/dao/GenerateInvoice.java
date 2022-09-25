package com.ops.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ops.model.Invoice;

public class GenerateInvoice {
	public Invoice getInvoice(int orderId) throws ClassNotFoundException, SQLException{
		String jdbcURL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
        String dbUser = "root";
        String dbPassword = "sql5188";
        //ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
        Invoice I = new Invoice();
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT * from invoice where orderId =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,orderId);
        
        ResultSet rs = statement.executeQuery();
        
        if(rs.next()){
        	I.setInvoiceId(rs.getInt("invoiceId"));
        	I.setInvoice_date(rs.getString("Invoice_date"));
        	I.setOrderId(rs.getInt("orderId"));
        	I.setCustomerId(rs.getInt("CustomerId"));
        	I.setProduct(rs.getString("product"));
        	I.setTypeOfGST(rs.getString("typeOfGST"));
        	I.setGSTamount(rs.getInt("GSTamount"));
        	I.setInvoiceAmount(rs.getInt("invoiceamount"));
        	I.setStatus(rs.getString("status"));
        	
        	return I;
        }
        else{
        	return null;
        }
        
        
        }
	}

