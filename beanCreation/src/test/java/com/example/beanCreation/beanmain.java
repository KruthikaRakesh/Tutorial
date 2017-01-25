package com.example.beanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class beanmain 
{
	public static void main(String args[])
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		GreetingsIntImpl  greetingsObj= (GreetingsIntImpl)context.getBean("greetingsobj");
		System.out.println(greetingsObj.sayHi());
	}

}
