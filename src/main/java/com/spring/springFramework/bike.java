package com.spring.springFramework;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle{
	
public void drive()
{
	System.out.println("let ride!");
}

}
