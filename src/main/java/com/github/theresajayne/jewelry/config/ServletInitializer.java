package com.github.theresajayne.jewelry.config;

import com.github.theresajayne.jewelry.Jewelry;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Jewelry.class);
	}

}
