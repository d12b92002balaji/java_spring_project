package com.spring.springFramework;

import org.springframework.stereotype.Component;

@Component
public class tyre {
	private String brand;


/*

	public String getBrand() {
		return brand;
	}
*/

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "its working..";
	}

	
	

}
