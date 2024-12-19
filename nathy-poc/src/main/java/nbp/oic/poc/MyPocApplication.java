package nbp.oic.poc;

import nbp.oic.poc.models.CarnetOrdreDto;
import nbp.oic.poc.services.ICarnetOrdreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class MyPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPocApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ICarnetOrdreService carnetOrdreService) {
        return args -> {
            carnetOrdreService.saveAll(
                    List.of(
                            CarnetOrdreDto.builder()
                                    .cle("My Cle")
                                    .nom("My first")
                                    .compte("88888888011")
                                    .message("My second")
                                    .numeroCompte("999999999022")
                                    .codeRetour("99")
                                    .codeBanque("781")
                                    .plageCompte("PLA-1")
                                    .origine("My origine")
                                    .referenceIntroduction(true)
                                    .referenceOpcvm(true)
                                    .topFinBourse("My top Fin bourse")
                                    .topFinOpcvm("My top fin OPCVM")
                                    .referenceBourse(true)
                                    .cautsrd("My cautsrd")
                                    .build(),
                            CarnetOrdreDto.builder()
                                    .cle("The Cle")
                                    .nom("The first")
                                    .compte("65555555922")
                                    .message("The second")
                                    .numeroCompte("4444444444033")
                                    .codeRetour("76")
                                    .codeBanque("544")
                                    .plageCompte("PLA-5")
                                    .origine("Her origine")
                                    .referenceIntroduction(true)
                                    .referenceOpcvm(true)
                                    .topFinBourse("Her top Fin bourse")
                                    .topFinOpcvm("Her top fin OPCVM")
                                    .referenceBourse(true)
                                    .cautsrd("Her cautsrd")
                                    .build(),
                            CarnetOrdreDto.builder()
                                    .cle("The Cle")
                                    .nom("The first")
                                    .compte("55555555011")
                                    .message("The second")
                                    .numeroCompte("666666666077")
                                    .codeRetour("22")
                                    .codeBanque("234")
                                    .plageCompte("PLA-2")
                                    .origine("The origine")
                                    .referenceIntroduction(true)
                                    .referenceOpcvm(true)
                                    .topFinBourse("The top Fin bourse")
                                    .topFinOpcvm("The top fin OPCVM")
                                    .referenceBourse(true)
                                    .cautsrd("The cautsrd")
                                    .build()

                            )
            );
        };
    }
}
