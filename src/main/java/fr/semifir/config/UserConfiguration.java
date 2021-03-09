package fr.semifir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.semifir.repositories.UserRepository;
import fr.semifir.services.UserService;
import fr.semifir.services.impl.UserServiceImpl;

@Configuration
public class UserConfiguration {

	@Bean
	public UserService userServiceFactory() {
		return new UserServiceImpl();
	}
}
