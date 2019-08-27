package com.starfall.javase.objectcopy.shallowcopy.shallowcopy2;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.shallowcopy.shallowcopy1
 * @className Job
 * @date 2019/8/27 10:39
 * @description Job
 */
public class Job {

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
		return "Job{" +
				"jobName='" + jobName + '\'' +
				", salary=" + salary +
				'}';
	}
}
