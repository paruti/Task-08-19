package org.test;

public class Sample {

	public static void main(String[] args) {
		
		try {
			throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
	
}
