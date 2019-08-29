package com.starfall.javase.objectserialization;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization
 * @className Job
 * @date 2019/8/29 14:19
 * @description Job
 */
public class Job implements Serializable {

	private static final long serialVersionUID = 3356897807642302429L;
	private String jobName;
	private double salary;

	public Job() {
	}

	public Job(String jobName, double salary) {
		this.jobName = jobName;
		this.salary = salary;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Job{" + "jobName='" + jobName + '\'' + ", salary=" + salary + '}';
	}
}
