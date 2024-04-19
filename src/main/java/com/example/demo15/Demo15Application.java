package com.example.demo15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo15Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo15Application.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student=context.getBean("temp", Student.class); //As we are not giving any other bean name, so that method name will be used as bean name here
		System.out.println(student);
		student.study();

	}

}
