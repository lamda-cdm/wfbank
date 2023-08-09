package org.example.MyFirstProj.model;

import java.math.BigDecimal;

public class Job {
	private String job_type;
	private BigDecimal salary;
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public Job(String job_type, BigDecimal salary){
		super();
		setJob_type(job_type);
		setSalary(salary);
	}
	@Override
	public String toString() {
		return "Job [job_type=" + job_type + ", salary=" + salary + "]";
	}
}
