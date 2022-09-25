package com.ops.model;

public class Invoice {
	private int invoiceId;
	private String invoice_date;
	private int orderId;
	private int customerId;
	private String product;
	private String typeOfGST;
	private int GSTamount;
	private int invoiceAmount;
	private String status;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getTypeOfGST() {
		return typeOfGST;
	}
	public void setTypeOfGST(String typeOfGST) {
		this.typeOfGST = typeOfGST;
	}
	public int getGSTamount() {
		return GSTamount;
	}
	public void setGSTamount(int gSTamount) {
		GSTamount = gSTamount;
	}
	public int getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
	}
	public Invoice(){
		
	}

}
