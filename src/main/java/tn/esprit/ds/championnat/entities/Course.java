package tn.esprit.ds.championnat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCourse;

    String emplacement;
    LocalDate dateCourse;

    @ManyToMany(mappedBy = "courses")
    private List<Championnat> championnats;

    @OneToMany(mappedBy = "course")
    private List<Position> positions;

    public Course(String emplacement, Long idCourse, LocalDate dateCourse) {
        this.emplacement = emplacement;
        this.idCourse = idCourse;
        this.dateCourse = dateCourse;
    }
    public Course() {}

}

