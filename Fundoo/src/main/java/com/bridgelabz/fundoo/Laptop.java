package com.bridgelabz.fundoo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int lid;
	private String brand;
	
	
	
	public Laptop() {
		System.out.println("Laptop.object has been created.....");
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void complile() {
		System.out.println("Laptop.complile()......");
	}

}
