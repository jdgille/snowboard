package com.aston.snowboard.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.aston.snowboard.domain"})
@EnableJpaRepositories(basePackages = {"com.aston.snowboard.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
