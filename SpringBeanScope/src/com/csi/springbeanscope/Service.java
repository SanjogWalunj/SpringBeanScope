package com.csi.springbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	Product product = (Product)context.getBean("prod");
	product.setProductId(121);
	product.setProductName("MI SMART TV ");
	System.out.println("\n product id : " +product.getProductId()+"\n product name : "+product.getProductName());
	
	Product product1 = (Product)context.getBean("prod");
	System.out.println("\n product id : "+product1.getProductId()+"\n product name: "+product1.getProductName());
}
}
