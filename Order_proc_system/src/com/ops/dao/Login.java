package com.ops.dao;

import java.sql.SQLException;

import com.ops.model.Employee;

public interface Login {
		public Employee checkEmpLogin(int empId, String pswd) throws ClassNotFoundException, SQLException;
	
}
