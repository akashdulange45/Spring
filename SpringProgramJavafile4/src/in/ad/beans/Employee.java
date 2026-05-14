package in.ad.beans;

public class Employee {
	private  String empName;
	private String empDept;
	private String empRoll;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpRoll() {
		return empRoll;
	}
	public void setEmpRoll(String empRoll) {
		this.empRoll = empRoll;
	}
	
	public void display() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Department : " + empDept);
		System.out.println("Employee Roll Of Employee : " + empRoll);
	}
	

}
