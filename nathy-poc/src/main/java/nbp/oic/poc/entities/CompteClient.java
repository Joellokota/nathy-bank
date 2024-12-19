package nbp.oic.poc.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Table(name = "tbl_compte_client")
@Entity
public class CompteClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String reseau;
    private String label;
    private String iban;
    private String compteEspeces;
    private Double solde;
}
