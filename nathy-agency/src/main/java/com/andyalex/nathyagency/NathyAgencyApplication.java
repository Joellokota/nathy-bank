package com.andyalex.nathyagency;

import com.andyalex.nathyagency.entity.Agency;
import com.andyalex.nathyagency.services.AgencyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class NathyAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(NathyAgencyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AgencyService agencyService) {
        return args -> {
            agencyService.saveAll(
                    List.of(
                            Agency.builder()
                                    .agencyNumber("3888")
                                    .name("Libreville Agency")
                                    .address("23 Rue de la paix")
                                    .description("Best agency of country")
                                    .build(),
                            Agency.builder()
                                    .agencyNumber("4444")
                                    .name("Brazzaville Agency")
                                    .address("43 Rue de la vie")
                                    .description("Worst agency of country")
                                    .build(),
                            Agency.builder()
                                    .agencyNumber("1111")
                                    .name("Kinshasa Agency")
                                    .address("56 Rue de la guerre")
                                    .description("The beautiful agency of country")
                                    .build()
                    )
            );
        };
    }
}
