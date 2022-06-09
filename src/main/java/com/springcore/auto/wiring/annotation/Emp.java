package com.springcore.auto.wiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}
@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("in setter method");
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("in constructor");
	}

	public Emp() {
		super();
		
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}