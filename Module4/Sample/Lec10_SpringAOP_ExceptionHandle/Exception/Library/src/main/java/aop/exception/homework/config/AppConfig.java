package aop.exception.homework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public LogBooks createLogBook() {
        return new LogBooks();
    }
}
