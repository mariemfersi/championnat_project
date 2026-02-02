package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    String nom;
    String pays;
    Float budgetAnnuel;
    Boolean bloquerContrat;

    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contrats;

    public Sponsor(Long idSponsor, String nom, String pays, Float budgetAnnuel, Boolean bloquerContrat) {
        this.idSponsor = idSponsor;
        this.nom = nom;
        this.pays = pays;
        this.budgetAnnuel = budgetAnnuel;
        this.bloquerContrat = bloquerContrat;
    }

    public Sponsor() {
    }
}

