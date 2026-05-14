package in.ad.beans;


public class Employee {
	private String empName;
	private String empDept;
	private int JoinYear;
	
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
	public int getJoinYear() {
		return JoinYear;
	}
	public void setJoinYear(int joinYear) {
		JoinYear = joinYear;
	}
	
	public void display() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Department : " + empDept);
		System.out.println("Employee Joining Year : " + JoinYear);
	}
	

}
