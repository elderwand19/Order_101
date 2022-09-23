package com.ops.BO;

import com.ops.model.Customer;
import com.ops.model.Employee;

public interface LoginBO {
	public String customerLogin(String email,String password);
	public String employeeLogin(String empEmail,String empPassword);
}
