package com.andyalex.nathycustomer;

import com.andyalex.nathycustomer.entity.Customer;
import com.andyalex.nathycustomer.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class NathyCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NathyCustomerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerService customerService) {
        return args -> {
            customerService.saveAll(
                    List.of(
                            Customer.builder()
                                    .firstName("Joel")
                                    .lastName("LOKOTA")
                                    .phone("07 87 87 87 98")
                                    .birthDate(LocalDate.of(1979, 04, 24))
                                    .customerNumber("9752000666609")
                                    .build(),
                            Customer.builder()
                                    .firstName("Nathalie")
                                    .lastName("DEZEME")
                                    .phone("07 87 99 87 98")
                                    .birthDate(LocalDate.of(1981, 2, 9))
                                    .customerNumber("9752000677609")
                                    .build(),
                            Customer.builder()
                                    .firstName("Alexandra")
                                    .lastName("MAMISALA")
                                    .phone("07 88 87 22 98")
                                    .birthDate(LocalDate.of(2010, 9, 30))
                                    .customerNumber("9752330666609")
                                    .build(),
                            Customer.builder()
                                    .firstName("Andrea")
                                    .lastName("GODELIVE")
                                    .phone("07 87 66 87 98")
                                    .birthDate(LocalDate.of(2014, 12, 7))
                                    .customerNumber("9752000666644")
                                    .build()
                            )
            );
        };
    }

}
