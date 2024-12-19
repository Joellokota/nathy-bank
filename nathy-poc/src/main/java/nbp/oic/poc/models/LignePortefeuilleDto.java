package nbp.oic.poc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LignePortefeuilleDto {

    private Long id;
    private LocalDate dateTermeOrdre;
    private int typePosition;
    private String iRecap;
    private String libellePosition;
    private String libelleTypeOrdre;
    private String typeOrdre;
    private String referenceOrdre;
    private LocalDate heureCreationOrdre;
    private LocalDate heureModification;
    private LocalDate dateCreationOrdre;
    private LocalDate dateModification;
    private double coursLimite;
    private double seuil;
    private String typeOperation;
    private String typeService;
    private int sautLigne;
    private String codeValeurPlace;
    private Integer codePlace;
    private String typeCotationObligation;
    private boolean isIndice;
    private String sit;
    private String typCrs;
    private String topPam;
    private String mTopOst;
    private String mTopAg;
    private String mTopMillesime;
    private String famille;
}
