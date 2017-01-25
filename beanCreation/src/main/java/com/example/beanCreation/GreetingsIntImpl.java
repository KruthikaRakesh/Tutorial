package com.example.beanCreation;

public class GreetingsIntImpl implements GreetingsInt
{
	private String msg;
	
	public String getMsg() 
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}	
	
	public String sayHi()
	{
		return this.msg;
	}
}
