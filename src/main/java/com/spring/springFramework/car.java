package com.spring.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car implements vehicle {
	@Autowired
	private tyre Tyre;
	
	public tyre getTyre() {
		return Tyre;
	}

	public void setTyre(tyre tyre) {
		this.Tyre = tyre;
	}

	public void drive() 
	{
		System.out.println("let go!"+Tyre);
	}

}
