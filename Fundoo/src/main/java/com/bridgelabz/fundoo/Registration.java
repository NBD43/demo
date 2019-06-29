package com.bridgelabz.fundoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("reg")
@Scope(value="prototype")
public class Registration {
	private String firstname;
	private String lastname;
	private String emailId;
	private String password;
	private long mobileNo;
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public Registration() {
		
		System.out.println("Registration.object has been created......");
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		System.out.println("Registration.show().......");
		laptop.complile();
		
	}
	@Override
	public String toString() {
		return "Registration [firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", password=" + password + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
