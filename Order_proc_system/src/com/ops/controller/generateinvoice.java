package com.ops.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ops.dao.GenerateInvoice;
import com.ops.model.Invoice;

@WebServlet("/generateinvoice")
public class generateinvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Invoice generatedInvoice = null;
		int oid = Integer.parseInt(request.getParameter("searchId"));
		
		GenerateInvoice gi = new GenerateInvoice();
		try {
			generatedInvoice = gi.getInvoice(oid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (generatedInvoice != null){
			
			generatedInvoice.setInvoiceId(generatedInvoice.getInvoiceId());
			generatedInvoice.setOrderId(oid);
			generatedInvoice.setCustomerId(generatedInvoice.getCustomerId());
			generatedInvoice.setProduct(generatedInvoice.getProduct());
			generatedInvoice.setTypeOfGST(generatedInvoice.getTypeOfGST());
			generatedInvoice.setGSTamount(generatedInvoice.getGSTamount());
			generatedInvoice.setInvoiceAmount(generatedInvoice.getInvoiceAmount());
			generatedInvoice.setStatus(generatedInvoice.getStatus());
			
			
			
			request.setAttribute("Invoice",generatedInvoice);
			RequestDispatcher rd=request.getRequestDispatcher("viewInvoice.jsp");
			rd.forward(request, response);
			}
		else{
			System.out.println("Please enter valid order ID");
		}
	}

}
