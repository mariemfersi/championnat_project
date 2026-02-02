package tn.esprit.ds.championnat.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class DetailChampionnat {
    @Id
    String idDetailChamp;
    String code;
    String description;

    public DetailChampionnat(String idDetailChamp, String code, String description) {
        this.idDetailChamp = idDetailChamp;
        this.code = code;
        this.description = description;
    }

    public DetailChampionnat() {
    }
}
