package com.ops.dao;

import com.ops.model.Customer;
import com.ops.model.Employee;

public interface LoginDao {
	public String customerLogin(String email,String password);
	public String employeeLogin(String empEmail,String empPassword);
}
