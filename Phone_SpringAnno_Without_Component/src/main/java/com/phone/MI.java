package com.phone;

import org.springframework.beans.factory.annotation.Autowired;

import com.processor.Snapdragon;
import com.spring.SpringAnno.MobileProcessor;

public class MI 
{
	@Autowired
	public Snapdragon snapdragon;
	
	public void getMI()
	{
		System.out.println("MI Note 4, 8 gB Ram");
		snapdragon.process();
	}
}
