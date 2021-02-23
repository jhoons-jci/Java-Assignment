package Exampleone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Organization 
{
	 
	 
	    public static void main(String args[])
	    {
	         
	        List<Employee> employeeList = new ArrayList<Employee>();
	        
	        employeeList.add(new Employee(10, "simran", 1 , 85000.0));
	        employeeList.add(new Employee(120, "ani", 2, 45000.0));
	        employeeList.add(new Employee(210, "aish", 1, 16000.0));
	        employeeList.add(new Employee(150, "ananya", 3 , 34000.0));
	        employeeList.add(new Employee(150, "deeshu", 2 , 12000.0));
	        employeeList.add(new Employee(150, "ankit", 4 , 52000.0));
	        employeeList.add(new Employee(150, "malvika", 1 , 63000.0));
	        employeeList.add(new Employee(150, "muskan", 1 , 22000.0));
	        employeeList.add(new Employee(150, "shalini", 2 , 36000.0));
	        employeeList.add(new Employee(150, "aniket", 4 , 37000.0));
	        employeeList.add(new Employee(150, "tanmay", 3 , 24000.0));
	         
	        
	        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
	        Map<Integer, Optional<Employee>> collect = 
	                employeeList.stream().collect(
	                    Collectors.groupingBy(
	                        Employee::getDeptId,
	                        Collectors.reducing(BinaryOperator.maxBy(bySalary))
	            )
	        );
	      
	        Depart address = new Depart(null);
	                address.setDepartmentName("1=HR , 2=Technical , 3=Finance , 4=Training ");
	                
	      System.out.println(address);
	        collect.entrySet().stream().forEach(System.out::println);
	    }
}
	
	 