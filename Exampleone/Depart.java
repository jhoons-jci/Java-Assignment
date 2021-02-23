package Exampleone;

class Depart 
{
	 String departmentName;
	static int deptid;
	
	public Depart(String departmentName) {
	this.departmentName=departmentName;
	}

	    public void setDepartmentName(String departmentName) {
	       this.departmentName=departmentName;
	    }
		
	
    public int getDeptId() 
    {
        return deptid;
    }
    public String getDepartmentName()
    {
    	return departmentName;
    }
    @Override
    public String toString() 
    {
        return "departmaneName : "+departmentName
                ;
    }

}


