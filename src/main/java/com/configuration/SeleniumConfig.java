package com.configuration;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfig {
    @Value("${selenium.browser}")
    private String browser;

    public String getBrowser() {
        return browser;
    }
}
