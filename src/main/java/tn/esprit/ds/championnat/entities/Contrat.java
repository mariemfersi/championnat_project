package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;

    Float montant;
    String annee;
    Boolean archived;
    @ManyToOne
    @JoinColumn(name = "equipe_id_equipe")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "sponsor_id_sponsor")
    private Sponsor sponsor;


    public Contrat() {
    }

    public Contrat(Long idContrat, Float montant, String annee, Boolean archived) {
        this.idContrat = idContrat;
        this.montant = montant;
        this.annee = annee;
        this.archived = archived;
    }

}
