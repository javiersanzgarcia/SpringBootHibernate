package springBootHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class starts Spring Boot application
 * @author Javier Sanz García
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * Method starts Spring Boot application
	 * @param args: contains the command-line arguments passed to the Java program upon invocation. 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
