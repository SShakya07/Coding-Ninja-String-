package com.springcore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Collection/configEmp.xml");
	Emp emp1 = (Emp)context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getCourses());
    System.out.println(emp1.getAddresses());
  }
}
