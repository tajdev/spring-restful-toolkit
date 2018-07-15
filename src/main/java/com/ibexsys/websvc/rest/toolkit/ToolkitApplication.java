package com.ibexsys.websvc.rest.toolkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class ToolkitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolkitApplication.class, args);
    }


    // Using AcceptHeaderLocalResolver, see corresponding example in HelloWorldController
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }


    /**  Using SessionLocaleResolver, see corresponding example in HelloWorldController
    @Bean
    public LocaleResolver localeResolver() {
        SessionlocaleResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }


    @Bean
    public ResourceBundleMessageSource bundleMessageSource(){
       ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

       messageSource.setBasename("messages");
       return messageSource;
    }

    **/
}
