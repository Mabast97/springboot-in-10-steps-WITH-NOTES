package springboot.basics.springbootin10stepsWITHNOTES;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/* This annotation indicates that:
 - this is the spring context file.
 - it enables something called AutoConfiguration
 - it enables something called ComponentScan

 ComponentScan: it would start automatically scanning the classes in the package and its subpackages for its beans. for example (@RestController in
 BooksController is one of the annotations which is scanned for, it means that @RestController would be registered as a bean)
 */
@SpringBootApplication
public class SpringbootIn10StepsWithNotesApplication {

	public static void main(String[] args) {
		// It used to run the spring context.
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsWithNotesApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
	}

}
