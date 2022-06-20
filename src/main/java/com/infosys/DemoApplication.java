package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(DemoApplication.class, args);
		
		Student s = (Student)con.getBean("S");
		s.setsName("Umesh");
		System.out.println(s.getsName());
		
		Employee e = (Employee)con.getBean("E");
		e.seteId(07);
		System.out.println(e.geteId());
				
	}

}
