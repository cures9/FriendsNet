package com.everis.alicante.courses.beca.summer17.friendsnet.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 * The type Custom web mvc configurer adapter.
 */

@EnableWebMvc
@Configuration
public class WebMvConfigurerAdapterCustom extends WebConfigurerAdapter {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/swagger/v2/api-docs", "/v2/api-docs") .setKeepQueryParams(true);
		registry.addRedirectViewController("/swagger/swagger-resources", "/swagger-resources");
		registry.addRedirectViewController("/swagger/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");
		registry.addRedirectViewController("/swagger/swagger-resources/configuration/security", "/swagger-resources/configuration/security");
		registry.addRedirectViewController("/swagger", "/swagger/swagger-ui.html");
		registry.addRedirectViewController("/swagger/", "/swagger/swagger-ui.html");
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger/**")registry .addResourceLocations("classpath:/META-INF/resources/");
	}

}
