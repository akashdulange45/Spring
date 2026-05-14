package in.ad.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Akash")
	private String empName;
	
	@Value("Software Devloper")
	private String empRoll;
	
	@Value("IT")
	private String empDept;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRoll() {
		return empRoll;
	}
	public void setEmpRoll(String empRoll) {
		this.empRoll = empRoll;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public void display() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Empolyee Roll : " + empRoll);
		System.out.println("Employee Department : " + empDept);
	}
}