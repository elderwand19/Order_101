package com.ops.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ops.dao.CheckEmpLogin;
import com.ops.model.Employee;

@WebServlet("/empservlet")
public class empservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = new Employee();
		int empId = Integer.parseInt(request.getParameter("eid"));
		String pswd = request.getParameter("password");
		
		
		CheckEmpLogin cel = new CheckEmpLogin();
		try {
			try {
				emp = cel.checkEmpLogin(empId,pswd);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (emp != null){
		emp.setEmployeeId(empId);
		emp.setPswd(pswd);
		request.setAttribute("Employee",emp);
		RequestDispatcher rd=request.getRequestDispatcher("emp_ops.jsp");
		rd.forward(request, response);}
	}



}
