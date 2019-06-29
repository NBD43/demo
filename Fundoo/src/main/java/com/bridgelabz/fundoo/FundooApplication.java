package com.bridgelabz.fundoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class FundooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(FundooApplication.class, args);
		
		Registration reg= context.getBean("reg", Registration.class);
		reg.show();
		
//		Registration reg1= context.getBean("reg", Registration.class);
//		reg1.show();
//		
		System.out.println("welcome to spring boot");
	}

}
