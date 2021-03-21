package com.example.naulmont.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages = {
        "com.example.naulmont.recipe",
        "com.example.naulmont.doctor",
        "com.example.naulmont.patient"})
public class RepositoryConfiguration {
}
