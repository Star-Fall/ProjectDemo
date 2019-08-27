package com.starfall.javase.objectcopy.deepcopy.deepcopy2;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.deepcopy.deepcopy2
 * @className Job
 * @date 2019/8/27 16:00
 * @description Job
 */
public class Job implements Serializable {
	private static final long serialVersionUID = -5289925864078678788L;
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
