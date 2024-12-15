package com.castle.dev.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
//	
//	 @Bean
//	 public WebMvcConfigurer corsConfigurer() {
//	 	return new WebMvcConfigurer() {
//	 		@Override
//	 		public void addCorsMappings(CorsRegistry registry) {
//	 			registry.addMapping("/**")
//	 				.allowedOrigins("localhost:8080")
//	 				.allowedMethods("GET", "POST", "OPTIONS", "PUT", "PATCH")
//	 				.allowedHeaders("Origin,Accept", "X-Requested-With", "Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers", "Authorization")
//	 				.exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
//	 				.maxAge(0);
//	 		}
//	 	};
//	 }

}
