package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach1=(Coach) context.getBean("mycoach1");
		Coach theCoach2=(Coach) context.getBean("mycoach2");
         System.out.println(theCoach1.getDailyWorkOut());
         System.out.println(theCoach2.getDailyWorkOut());
         
         context.close();
	}

}
