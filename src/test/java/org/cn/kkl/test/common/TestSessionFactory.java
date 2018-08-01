package org.cn.kkl.test.common;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSessionFactory {

	private ApplicationContext applicationContext;
	
	private SessionFactory sessionFactory;
	
	private String configurationPath="spring/applicationContext.xml";
	
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:"+configurationPath);
		sessionFactory=(SessionFactory) applicationContext.getBean("sessionFactory");
	}
	
	@Test
	public void openSessionFactory(){
		System.out.println(sessionFactory.openSession());
	}
}
