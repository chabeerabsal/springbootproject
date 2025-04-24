package com.Springboot.HelloWorls.Springbootday0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootday0Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Springbootday0Application.class,args);

		Allien obj=context.getBean(Allien.class);
		System.out.println(obj.getAge());
        obj.compile();
	}

}
