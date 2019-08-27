package com.starfall.javase.objectcopy.deepcopy.deepcopy1;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.deepcopy.deepcopy1
 * @className Job
 * @date 2019/8/27 14:58
 * @description Job
 */
public class Job implements Cloneable {
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

	@Override
	public Job clone() {
		Job job = null;
		try {
			job = (Job) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return job;
	}
}
