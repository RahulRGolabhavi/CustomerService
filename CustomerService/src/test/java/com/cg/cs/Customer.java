package com.cg.cs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	private int id;
	private String name;
	private int order_id;
	private int phone;
	private String email;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String name, int order_id, int phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.order_id = order_id;
		this.phone = phone;
		this.email = email;
	}
@Id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" +id + ", name=" + name + ", order_id" + order_id + ", phone=" + phone + ", email=" + email + ", getId()=" + getId() + ", getName()=" + getName() + ", getOrder_id()=" + getOrder_id() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
