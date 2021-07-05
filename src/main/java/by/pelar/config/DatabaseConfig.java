package by.pelar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource bds = new DriverManagerDataSource();
        bds.setDriverClassName("org.postgresql.Drive");
        bds.setUrl("jdbc:mysql://localhost:5432/dbname");
        bds.setUsername("user");
        bds.setPassword("pass");

        return bds;
    }

}

