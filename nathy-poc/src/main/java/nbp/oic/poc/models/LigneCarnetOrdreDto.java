package nbp.oic.poc.models;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LigneCarnetOrdreDto {

    private Long id;
    private String famille;
    private String typeReglement;
    private String referenceOrdre;
    private String nature;
    private String codeValeur;
    private String idPlace;
    private String libelleValeur;
    private String quantite;
    private LocalDate dateOrdre;
    private LocalDate dateValidite;
    private String modalite;
    private String etat;
    private String typeQte;
    private String topAnnul;
    private Double limite;
    private Double cours;
    private Double net;
    private String agent;
    private LocalDate dateExecution;
    private String deviseOrdre;
    private Double seuil;
    private String pie;
    private String topAcv;
    private String topFenetre;
    private String topFCPI;
    private String topSuppr;
    private String codeReparation;
    private String typeAction;
    private String quantiteSaisie;
    private String quantiteExecute;
    private boolean isAutoriseAchat;
    private boolean isAutoriseVente;
    private boolean isAutoriseTactique;
    private char topSuppressionAutomatique;
    private String referenceOrigine;
    private Double ecart;
    private Double limiteSeuilCours;
    private char topSTP;

}
