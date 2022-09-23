package com.ops.BO;

import com.ops.dao.LoginDao;
import com.ops.dao.LoginDaoImpl;
import com.ops.model.Customer;
import com.ops.model.Employee;

public class LoginBOImpl implements LoginBO {

	public String customerLogin(String email,String password) {
		LoginDao ld=new LoginDaoImpl();
		String status=ld.customerLogin(email,password);
		return status;
	}

	@Override
	public String employeeLogin(String empEmail,String empPassword) {
		LoginDao ld1=new LoginDaoImpl();
		String status=ld1.employeeLogin(empEmail,empPassword);
		return status;
	}
	
}
