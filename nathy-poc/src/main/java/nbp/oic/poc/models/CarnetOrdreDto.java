package nbp.oic.poc.models;
import lombok.*;
import java.util.List;

@Getter @Setter @Builder @AllArgsConstructor
@NoArgsConstructor
public class CarnetOrdreDto {

    private Long id;
    private String codeBanque;
    private String plageCompte;
    private String numeroCompte;
    private String origine;
    private boolean referenceBourse;
    private boolean referenceOpcvm;
    private boolean referenceIntroduction;
    private String codeRetour;
    private String message;
    private String compte;
    private String cle;
    private String nom;
    private String topFinBourse;
    private String topFinOpcvm;
    private String cautsrd;
    List<LigneCarnetOrdreDto> ligneCarnetOrdres;

}
