package com.example.demo1.xml;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo1.game.GameRunner;

public class XmlConfiguration {
    public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();

		}
	}
}
