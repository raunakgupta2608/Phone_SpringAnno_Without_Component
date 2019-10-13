package com.phone;

import org.springframework.beans.factory.annotation.Autowired;

import com.processor.Cynogen;
import com.spring.SpringAnno.MobileProcessor;

public class Samsung 
{
	@Autowired
	public Cynogen cynogen;
	
	
	public void config()
	{
		System.out.println("Octa core, 4gb RAM");
		cynogen.process();
	}
}
