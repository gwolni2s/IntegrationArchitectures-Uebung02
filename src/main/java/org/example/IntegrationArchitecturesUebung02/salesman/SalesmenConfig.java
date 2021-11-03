/*
package org.example.IntegrationArchitecturesUebung02.salesman;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SalesmenConfig {

    @Bean
    CommandLineRunner commandLineRunner(SalesmenRepository repository) {
        return args -> {
            Salesmen georg = new Salesmen(
                    8L,
                    "Georg",
                    "Wolnik"
            );

            Salesmen mario = new Salesmen(
                    7L,
                    "Mario",
                    "Permesan"
            );
            repository.saveAll(
                    List.of(georg, mario)
            );
        };
    }
}
*/

