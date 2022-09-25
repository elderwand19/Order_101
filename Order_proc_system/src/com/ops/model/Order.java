package com.ops.model;



public class Order extends Customer{
	private String order_date;
	private Integer gstno;
	private Integer shipping_cost;
	private Integer order_value;
	private String status;
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getOrder_date() {
		return order_date;
	}


	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}


	public int getGstno() {
		return gstno;
	}


	public void setGstno(int gstno) {
		this.gstno = gstno;
	}


	public int getShipping_cost() {
		return shipping_cost;
	}


	public void setShipping_cost(int shipping_cost) {
		this.shipping_cost = shipping_cost;
	}


	public int getOrder_value() {
		return order_value;
	}


	public void setOrder_value(int order_value) {
		this.order_value = order_value;
	}
	
	


	public Order(Integer gstno,Integer shipping_cost,Integer order_value,String status){
		this.gstno = gstno;
		this.shipping_cost = shipping_cost;
		this.order_value = order_value;
		this.status = status;
	}
	


	public Order() {
		// TODO Auto-generated constructor stub
	}
	

}
