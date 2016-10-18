package com.wkkim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wkkim.template.Mystruct.MyStruct;

public class TProtoBuffer
{
	Logger logger = LoggerFactory.getLogger(TProtoBuffer.class);
	
	public static void main(String[] args)
	{
		new TProtoBuffer().test();
	}

	private void test()
	{
		try
		{
			MyStruct myStruct = MyStruct.newBuilder().setAge(25).setName("wkkim").setSex("male").build();

			logger.debug("******************** age = {}", myStruct.getAge());
			logger.debug("******************** name = {}", myStruct.getName());
			logger.debug("******************** sex = {}", myStruct.getSex());
			
			logger.debug("******************** bytes[] = {}", myStruct.toByteArray());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
