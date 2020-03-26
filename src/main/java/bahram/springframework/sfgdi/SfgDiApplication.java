package bahram.springframework.sfgdi;

import bahram.springframework.sfgdi.controllers.ConstructorInjectedController;
import bahram.springframework.sfgdi.controllers.MyController;
import bahram.springframework.sfgdi.controllers.ProppertyInjectedController;
import bahram.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("---------------------------------Property-----------------------------------");

		ProppertyInjectedController proppertyInjectedController = (ProppertyInjectedController) ctx.getBean("proppertyInjectedController");
		System.out.println(proppertyInjectedController.getGreeting());

		System.out.println("---------------------------------Setter-----------------------------------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------------------------Constructor-----------------------------------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
