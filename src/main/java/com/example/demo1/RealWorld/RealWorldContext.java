package com.example.demo1.RealWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldContext {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(RealWorldContext.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			
		}
	}
}