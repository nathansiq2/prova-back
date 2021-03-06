package com.cidades.API.Config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	@Bean
	public Docket cidadesApi() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cidades.API"))
				.paths(regex("/cidades.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		return new ApiInfo(
				"Swagger API Cidades",
				"Prova SENIOR Java",
				"1.0",
				"Termos de serviço",
				"Nathan Siqueira de Sousa",
				"Apache License Version 2.0",
				"https://www.apache.org/license.html");
	}

}
