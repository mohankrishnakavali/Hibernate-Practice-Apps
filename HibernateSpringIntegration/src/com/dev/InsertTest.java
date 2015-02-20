package com.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class InsertTest {
	@Transactional(readOnly = false)
	public static void main(String[] args) {

		/*
		 * Resource r=new ClassPathResource("applicationContext.xml");
		 * BeanFactory factory=new XmlBeanFactory(r);
		 */
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) app.getBean("d");

		Employee e = new Employee();
		e.setId(114);
		e.setName("varun");
		e.setSalary(50000);

		dao.saveEmployee(e);

	}
}