package Exampleone;

	 
	class Employee implements Comparable<Employee>
	{
		
		    String name;
		    int id;
		    double salary;
		     int deptid;
		  

			public Employee(int id, String name, int deptid, double salary) {
				// TODO Auto-generated constructor stub
				this.id = id;
		        this.name = name;
		        this.deptid=deptid;
		        this.salary = salary;
			}

			public int getId() 
		    {
		        return id;
		    }
		     
		    public String getName() 
		    {
		        return name;
		    }
		     
		    public int getDeptId() 
		    {
		        return deptid;
		    }
		    public double getSalary() 
		    {
		        return salary;
		    }
		   
		    @Override
		    public String toString() 
		    {
		        return "Id : "+id
		                +", Name : "+name
		                +", deptid : "+deptid
		                +", Salary : "+salary
		       ;
		    }

			@Override
			public int compareTo(Employee o) {
				// TODO Auto-generated method stub
				return 0;
				
			}
	   
	}