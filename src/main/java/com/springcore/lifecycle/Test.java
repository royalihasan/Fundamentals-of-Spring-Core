package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		 * AbstractApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml"); Butter
		 * butter=(Butter) context.getBean("butter");
		 * System.out.println(butter.getPrice()); context.registerShutdownHook();
		 * System.out.println("+++++++++++++++++++++++++++++");
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Scientist scientist = (Scientist) context.getBean("scientist");
		System.out.println(scientist.getId());

	}
}
