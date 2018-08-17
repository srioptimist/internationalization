package sri.spring.boot.internationalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.security.RolesAllowed;

@ServletComponentScan
@ComponentScan("sri.spring")
@SpringBootApplication
public class InternationalizationApplication {
	@RolesAllowed("*")
	public static void main(String[] args) {
		System.setProperty("security.basic.enabled", "false");
		SpringApplication.run(InternationalizationApplication.class, args);
	}
}
