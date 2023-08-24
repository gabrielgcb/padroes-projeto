package dio.digital.innovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* Projeto Spring Boot gerado via Spring Initializr.
* Os seguintes módulos foram selecionados:
* - Spring Data Jpa
* - Spring Web
* - H2 Database
* - Open Feigh
*
* @author gabrielgcb
* */

@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
