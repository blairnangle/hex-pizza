package com.blairnangle.hexpizza.adapters.config;

import com.blairnangle.hexpizza.HexagonalPizza;
import com.blairnangle.hexpizza.adapters.persistence.PizzaRepository;
import com.blairnangle.hexpizza.domain.PizzaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalPizza.class)
public class BeanConfiguration {

    @Bean
    PizzaService pizzaService(PizzaRepository repository) {
        return new PizzaService(repository, repository);
    }
}
