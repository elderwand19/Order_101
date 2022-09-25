package com.ops.dao;

import java.sql.SQLException;

import com.ops.model.Customer;

public interface CustomerLogin {
	public Customer checkCustomerLogin(int cusId, String pswd) throws ClassNotFoundException, SQLException;
}
