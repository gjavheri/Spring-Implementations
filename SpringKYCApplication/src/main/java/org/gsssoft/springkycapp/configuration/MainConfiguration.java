package org.gsssoft.springkycapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MainConfiguration {
	
	@Bean
	public ViewResolver getInternalResourceResolver(){
		InternalResourceViewResolver iview= new InternalResourceViewResolver();
		iview.setPrefix("/WEB-INF/jsp/");
		iview.setSuffix(".jsp");
		
		return iview;
	}

}
