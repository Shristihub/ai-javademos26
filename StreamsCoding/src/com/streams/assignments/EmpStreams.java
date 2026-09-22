package com.streams.assignments;

import java.util.List;

public class EmpStreams {

	public static void main(String[] args) {
		
		// get all the employees
		List<Employee> employees =  EmployeeDetails.getAllEmployees();
		//get the employees by city

		//by city
		employees.stream().filter(emp->emp.getCity().equals("Bangalore"))
					      .forEach(emp->System.out.println(emp));
		System.out.println();
	    System.out.println("by salary greater thean 10000 and print the names");
		employees.stream().filter(emp->emp.getSalary()>20000)
						  .map(emp->emp.getEmpName()) // Stream<String>
					      .forEach(emp->System.out.println(emp));
						  System.out.println();
		System.out.println();
		System.out.println("Employees names in reverse alphabetial order n sorted");
		  employees.stream()
		           .map(emp -> emp.getEmpName().toUpperCase())
		           .sorted((str1, str2)->str2.compareTo(str1))
		           .forEach(emp->System.out.println(emp));
		  
		  System.out.println();
		System.out.println("in alpha order");  
		 employees.stream()
		          .sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()))
		          .forEach(emp->System.out.println(emp));

		System.out.println();
		System.out.println("Get the Salary sorted by ascending order");
		employees.stream()
				 .map(emp->emp.getSalary())	
				 .sorted()
				 .forEach(sal->System.out.println(sal));
		
		
		System.out.println();
		System.out.println("employees sorted by salary in descending order");  
		employees.stream()
//		      .sorted((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary()))
			  .sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()))// sort by sal in desc
		      .forEach(emp->System.out.println(emp));
			
		      
	  // get by id 101 if not throw exception
	
		System.out.println("get by id 101 if not throw exception ");
		Employee emp1 =  employees.stream()
		  .filter(emp->emp.getEmpId()==111)
		  .findFirst()
		  .orElseThrow(()-> new EmployeeNotFoundException("No Emp Found"));
	    System.out.println(emp1);
		
	}
}
