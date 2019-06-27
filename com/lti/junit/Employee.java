package com.lti.junit;

public class Employee {
private int empId;
private String name;
private int salary;

public Employee( int empId,String name,int salary) {
	super();
	this.name=name;
	this.empId=empId;
	this.salary=salary;
	
	
}


public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public boolean equals(Object obj) {
	Employee emp=(Employee) obj;
	boolean status=false;
	if(this.name.equalsIgnoreCase(emp.name)
			&& this.empId ==emp.empId
			&&this.salary== emp.salary)
	{
		status = true;
	}
	return status;
}
public static String getEmpNameWithHighestSalary() {
	/** * logic to get Highest paid employee   */
	return "afrin";
}
public static Employee getHighestPaidEmployee() {
	
	/** * logic to get Highest paid employee   */
	return new Employee(1, "afrin", 19000);
}
public int hashCode()
{
	return this.empId;
}


	}
			
