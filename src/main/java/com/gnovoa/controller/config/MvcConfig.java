
//Namespace
package com.gnovoa.controller.config;

//Imports
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MVC configuration class
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    /**
     * Define the different views
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.html");
    }

}
