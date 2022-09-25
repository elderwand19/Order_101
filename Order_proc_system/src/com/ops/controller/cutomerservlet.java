package com.ops.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ops.dao.CheckCustomerLogin;
import com.ops.model.Customer;


@WebServlet("/cutomerservlet")
public class cutomerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cusId = Integer.parseInt(request.getParameter("cusid"));
		String pswd = request.getParameter("password");
		
		Customer c2 = new Customer();
		CheckCustomerLogin cel = new CheckCustomerLogin();
		try {
			try {
				c2 = cel.checkCustomerLogin(cusId,pswd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(c2!=null){
		request.setAttribute("Customer",cel);
		RequestDispatcher rd=request.getRequestDispatcher("cus_ops.jsp");
		rd.forward(request, response);}
	}




}
