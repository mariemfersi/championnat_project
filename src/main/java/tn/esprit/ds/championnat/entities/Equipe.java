package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipe;

    String libelle;
    Integer nbPointsTotal;
    Integer classementGeneral;

    @OneToMany(mappedBy = "equipe")
    private List<Pilote> pilotes;

    @OneToMany(mappedBy = "equipe")
    private List<Contrat> contrats;

    public Equipe(Long idEquipe, String libelle, Integer nbPointsTotal, Integer classementGeneral) {
        this.idEquipe = idEquipe;
        this.libelle = libelle;
        this.nbPointsTotal = nbPointsTotal;
        this.classementGeneral = classementGeneral;
    }
    public Equipe() {}

}

