package com.streams.assignments;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMethStreams {

	public static void main(String[] args) {
		
		// get all the employees
		List<Employee> employees =  EmployeeDetails.getAllEmployees();
		//get the employees by city

		//by city
		employees.stream().filter(emp->emp.getCity().equals("Bangalore"))
					      .forEach(System.out::println);
		System.out.println();
	    System.out.println("by salary greater thean 10000 and print the names");
		employees.stream().filter(emp->emp.getSalary()>20000)
						  .map(Employee::getEmpName) // Stream<String>
					      .forEach(System.out::println);
						  System.out.println();
		System.out.println();
		System.out.println("Employees names in reverse alphabetial order n sorted");
		  employees.stream()
		           .map(Employee::getEmpName) //Stream<Employee> ->Stream<String>
		           .map(String::toUpperCase) // Stream<String>=> Stream<String>
		           .sorted((str1, str2)->str2.compareTo(str1))
		           .forEach(System.out::println);
		  
		  System.out.println();
		System.out.println("in alpha order");  
		 employees.stream()
		          .sorted(Comparator.comparing(Employee::getEmpName))
		          .forEach(System.out::println);

		System.out.println();
		System.out.println("Get the Salary sorted by ascending order");
		employees.stream()
				 .map(emp->emp.getSalary())	
				 .sorted()
				 .forEach(sal->System.out.println(sal));
		
		
		System.out.println();
		System.out.println("employees sorted by salary in descending order");  
		employees.stream()
			  .sorted(Comparator.comparing(Employee::getSalary).reversed())// sort by sal in desc
		      .forEach(System.out::println);
			
		      
	  // get by id 101 if not throw exception
	
		System.out.println("get by id 101 if not throw exception ");
		Employee emp1 =  employees.stream()
		  .filter(emp->emp.getEmpId()==101)
		  .findFirst()
		  .orElseThrow(()-> new EmployeeNotFoundException("No Emp Found"));
	    System.out.println(emp1);
		
	    System.out.println("sum of salaries");
	    Double sum = employees.stream()
	             .map(Employee::getSalary) //Stream<Double>
	             .reduce(0.0, (x,y)->x+y);
	    System.out.println(sum);
	    
	    double sum1 = employees.stream()
	          .mapToDouble(Employee::getSalary) //DoubleStream
	          .sum();
	    System.out.println(sum1);
	    
	    System.out.println("14.Group all employees by department");
	    Map<String, List<String>> mapEmp = 
	    		employees.stream()
	             .collect(
	            		Collectors.groupingBy(
	            		Employee::getDepartment,
	            		Collectors.mapping(Employee::getEmpName,Collectors.toList())));
	    
	    
	    mapEmp.forEach((k, v) -> {
	     System.out.println(k + " " + v);
	    });
	    System.out.println();
	    
	    
	    
	             
	    
	    
	    
	}
}
