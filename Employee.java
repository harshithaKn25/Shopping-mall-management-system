package com.tns.sf04;

import jakarta.persistence.*;

@Entity 
@Table(name="Employee")
public class Employee {
	@Id
	private Integer id;
	private String name; 
	 private Integer dob; 
	 private Float salary; 
	 private String address; 
	 private String designation; 
	 private Integer shop_id;
	 public Employee(){
		 
	 }
	public Employee(Integer id, String name, Integer dob, Float salary, String address, String designation,
			Integer shop_id) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop_id = shop_id;
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
	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + ", shop_id=" + shop_id + "]";
	}

}
