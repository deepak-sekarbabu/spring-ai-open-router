package com.example.springai.config;

import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;

/**
 * Loads environment variables from a .env file and sets them as system
 * properties
 * for Spring Boot to use property placeholders like ${VAR_NAME} in
 * configuration files.
 */
@Configuration
public class DotenvConfig {
    @PostConstruct
    public void loadEnv() {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach(entry -> {
            if (System.getProperty(entry.getKey()) == null && System.getenv(entry.getKey()) == null) {
                System.setProperty(entry.getKey(), entry.getValue());
            }
        });
    }
}
