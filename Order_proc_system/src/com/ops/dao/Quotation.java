package com.ops.dao;

import java.sql.SQLException;

import com.ops.model.Order;

public interface Quotation {
	public String createQuotation(Order order) throws ClassNotFoundException,SQLException;
}
