package com.github.theresajayne.jewelry.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * Created by Theresa on 12/09/2015.
 */
@Configuration
@ComponentScan(basePackages = {"com.github.theresajayne.jewelry"})
public class JewelryConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(32768);
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(32768);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(32768);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
