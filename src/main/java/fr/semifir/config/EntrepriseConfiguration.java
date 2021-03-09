package fr.semifir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.semifir.services.EntrepriseService;
import fr.semifir.services.impl.EntrepriseServiceImpl;

@Configuration
public class EntrepriseConfiguration {

	
	@Bean
	public EntrepriseService entrepriseServiceFactory() {
		return new EntrepriseServiceImpl();
	}
}
