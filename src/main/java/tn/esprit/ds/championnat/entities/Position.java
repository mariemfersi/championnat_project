package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;

    private Integer classement;
    private Integer nbPoints;

    @ManyToOne
    Course course;

    @ManyToOne
    Pilote pilote;

    public Position(Long idPosition, Integer classement, Integer nbPoints) {
        this.idPosition = idPosition;
        this.classement = classement;
        this.nbPoints = nbPoints;
    }
    public Position() {}
}
