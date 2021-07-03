package com.plasticon.erp.configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

	  @Configuration
	  public class CORSConfig implements WebMvcConfigurer {
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/api/**")
	            .allowedOrigins("http://domain2.com")
	            .allowedMethods("PUT", "DELETE","GET", "POST")
	            .allowedHeaders("header1", "header2", "header3")
	            .exposedHeaders("header1", "header2")
	            .allowCredentials(false).maxAge(3600);
	    }
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	  }


}
