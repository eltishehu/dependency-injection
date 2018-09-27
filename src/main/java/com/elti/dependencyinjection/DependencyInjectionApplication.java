package com.elti.dependencyinjection;

import com.elti.dependencyinjection.controllers.ConstructorInjectedController;
import com.elti.dependencyinjection.controllers.GetterInjectedController;
import com.elti.dependencyinjection.controllers.MyController;
import com.elti.dependencyinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.elti.dependencyinjection.services", "com.elti.dependencyinjection.controllers", "com.elti"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		// SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}
}
