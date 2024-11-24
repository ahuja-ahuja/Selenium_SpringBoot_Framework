package com.example.main_learning;

import com.configuration.SeleniumConfig;
import com.example.Learning_API_Spring.ComponentAnnotationUsing;
import com.example.Learning_API_Spring.SIngleConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan({"com.example","com.pages"})
@Import(SeleniumConfig.class)
public class RunnableClass {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(RunnableClass.class, args);
//		applicationContext.getBean(ComponentAnnotationUsing.class).firstmethod();

		applicationContext.getBean(SIngleConstructor.class).getDemoMethod();
		//value injection
//		System.out.println(applicationContext.getBean(SeleniumConfig.class).getBrowser());


	}

}
