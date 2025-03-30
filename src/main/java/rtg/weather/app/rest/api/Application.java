package rtg.weather.app.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	//h2 = localhost:8080/h2-console
	//swagger = localhost:8080/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
