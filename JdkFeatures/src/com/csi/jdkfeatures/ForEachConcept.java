package com.csi.jdkfeatures;

import java.util.ArrayList;

class EmployeeDeatails
{
	int empId;
	String empName;
	String empAdd;
	double empSalary;
	long empContactNumber;
	public EmployeeDeatails(int empId, String empName, String empAdd, double empSalary, long empContactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empSalary = empSalary;
		this.empContactNumber = empContactNumber;
	}
	@Override
	public String toString() {
		return "EmployeeDeatails [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", EmpSalary="
				+ empSalary + ", empContactNumber=" + empContactNumber + "]";
	}
}
public class ForEachConcept {

	public static void main(String[] args) {
		ArrayList<EmployeeDeatails> empList = new ArrayList<EmployeeDeatails>();
		empList.add(new EmployeeDeatails(121, "JYOTI", "PUNE", 45000.25, 25348995336l));
		empList.add(new EmployeeDeatails(122, "HARSHA", "JALGAON", 45393.02, 55662663245l));
		empList.add(new EmployeeDeatails(123, "ANKITA", "SOLAPUR",45823.12, 456256315852l));
		//empList.forEach(emp->System.out.println(emp));//for each method using lambda expression
		//empList.forEach(System.out::println);//for each method using double colon
		for (EmployeeDeatails ed : empList) {  //for each loop
			System.out.println(ed);
			
		}
	}

}
