package project1.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project1.p1.Config.AutoAppConfig;
import project1.p1.Config.appConfig;

@SpringBootApplication
public class P1Application {

	public static void main(String[] args) {
		SpringApplication.run(P1Application.class, args);

	}

}
