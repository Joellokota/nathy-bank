package nbp.oic.poc.models;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
public class CompteClientDto {

    private Long id;
    private String type;
    private String reseau;
    private String label;
    private String iban;
    private String compteEspeces;
    private Double solde;
}

