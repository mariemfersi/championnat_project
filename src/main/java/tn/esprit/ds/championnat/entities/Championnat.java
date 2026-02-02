package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity

public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChampionnat;

    @Enumerated(EnumType.STRING)
    Categorie categorie;

    String libelleC;
    Integer annee;

    @OneToOne(cascade = CascadeType.ALL)
    private DetailChampionnat detailChampionnat;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courses;


    public Championnat() {
    }

    public Championnat(Long idChampionnat, Categorie categorie, String libelleC, Integer annee) {
        this.idChampionnat = idChampionnat;
        this.categorie = categorie;
        this.libelleC = libelleC;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Championnat{" +
                "idChampionnat=" + idChampionnat +
                ", categorie=" + categorie +
                ", libelleC='" + libelleC + '\'' +
                ", annee=" + annee +
                '}';
    }



}

