package com.ops.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ops.dao.QuotationImp;
import com.ops.model.Order;


@WebServlet(description = "Created Quotation are submitted here", urlPatterns = { "/submitquotation" })
public class submitquotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Quotaion is created");
		String ans = null;
		String order_Date = request.getParameter("odate");
		String customer_id = request.getParameter("cid");
		String ogst = request.getParameter("cgst");
		String oaddress = request.getParameter("address");
		String ocity = request.getParameter("city");
		String opin = request.getParameter("pincode");
		String ophone = request.getParameter("phone");
		String omail = request.getParameter("mail");
		String oshippingcost = request.getParameter("shippingcost");
		String order_value = request.getParameter("ordervalue");
		String status = "pending";
		
		Order o = new Order();
		o.setGstno(Integer.parseInt(ogst));
		o.setId(Integer.parseInt(customer_id));
		o.setAddress(oaddress);
		o.setOrder_date(order_Date);
		o.setCity(ocity);
		o.setPincode(Integer.parseInt(opin));
		o.setMail(omail);
		o.setShipping_cost(Integer.parseInt(oshippingcost));
		o.setOrder_value(Integer.parseInt(order_value));
		o.setStatus(status);
		
		 QuotationImp quo = new QuotationImp();
		 try {
			ans = quo.createQuotation(o);
			System.out.println(ans);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if (ans != null){
				RequestDispatcher rd=request.getRequestDispatcher("Thank_page.html");
				rd.forward(request, response);}
		 
		
	}

}
