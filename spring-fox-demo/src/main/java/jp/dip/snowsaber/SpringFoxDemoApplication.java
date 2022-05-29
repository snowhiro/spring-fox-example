package jp.dip.snowsaber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
//@Profile({"application", "swagger-doc.yaml"})
public class SpringFoxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFoxDemoApplication.class, args);
	}


}
