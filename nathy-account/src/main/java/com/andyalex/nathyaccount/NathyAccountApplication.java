package com.andyalex.nathyaccount;

import com.andyalex.nathyaccount.entity.AccountBank;
import com.andyalex.nathyaccount.services.AccountBankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class NathyAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(NathyAccountApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountBankService accountBankService) {
        return args -> {
            accountBankService.saveAll(
                    List.of(
                            AccountBank.builder()
                                    .accountNumber("8988828882828")
                                    .name("Nathalie Account")
                                    .bankName("BNP")
                                    .bankAccountType("Join Account")
                                    .build(),
                            AccountBank.builder()
                                    .accountNumber("89822328882828")
                                    .name("Joël Account")
                                    .bankName("CA")
                                    .bankAccountType("Deposit Account")
                                    .build(),
                            AccountBank.builder()
                                    .accountNumber("8988828881111")
                                    .name("Alexandra Account")
                                    .bankName("BPCE")
                                    .bankAccountType("Title Account")
                                    .build(),
                            AccountBank.builder()
                                    .accountNumber("8988828880909")
                                    .name("Andrea Account")
                                    .bankName("SOcieté Générale")
                                    .bankAccountType("Kid Account")
                                    .build()
                            )
            );
        };
    }
}
