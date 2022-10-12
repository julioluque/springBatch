package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserBatch")
public class User {

	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private Date time;

	public User() {
	}

	public User(Integer id, String name, String dept, Integer salary, Date time) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", name=").append(name).append(", dept=").append(dept)
				.append(", salary=").append(salary).append(", time=").append(time).append("]");
		return builder.toString();
	}

}
