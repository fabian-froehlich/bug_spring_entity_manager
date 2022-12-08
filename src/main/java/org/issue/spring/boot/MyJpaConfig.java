package org.issue.spring.boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = { Application.class })
@EnableJpaRepositories(basePackageClasses = { Application.class })
@EnableJpaAuditing
public class MyJpaConfig {
}
