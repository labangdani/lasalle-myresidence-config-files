package org.lasalle.demo.lasallemyresidenceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LasalleMyresidenceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LasalleMyresidenceConfigServerApplication.class, args);
	}

}
