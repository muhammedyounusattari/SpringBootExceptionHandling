package younus.attari.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan("younus.attari")
@EnableWebMvc
public class SpringConfigurationMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringConfigurationMain.class, args);

	}

}
