package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @ManyToOne
    Equipe equipe;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;

    public Pilote() {
    }

    public Pilote(String libelleP, Long idPilote, Integer nbPointsTotal, Integer classementGeneral) {
        this.libelleP = libelleP;
        this.idPilote = idPilote;
        this.nbPointsTotal = nbPointsTotal;
        this.classementGeneral = classementGeneral;
    }
}

