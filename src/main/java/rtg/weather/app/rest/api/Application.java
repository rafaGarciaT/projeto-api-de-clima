package rtg.weather.app.rest.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {
	//h2 = localhost:8080/h2-console
	//swagger = localhost:8080/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
