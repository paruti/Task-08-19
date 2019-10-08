package org.test;

public class EmployeeNotFoundException extends Exception {

	
	@Override
	public String getMessage() {	
		return "Not Found";
	}
	
	
}
