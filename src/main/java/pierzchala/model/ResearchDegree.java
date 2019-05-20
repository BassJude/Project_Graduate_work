package pierzchala.model;

import org.hibernate.validator.constraints.NotBlank;
import pierzchala.validator.EditValidator;
import pierzchala.validator.RegistrationValidator;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "stopien_naukowy")
public class ResearchDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_stopnia;

    @Column(length = 50)
    @Size(max = 50, message = "Długość maksymalnie 50 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class}, message = "Nie może być puste")
    private String nazwa;

    public Long getId_stopnia() {
        return id_stopnia;
    }

    public void setId_stopnia(Long id_stopnia) {
        this.id_stopnia = id_stopnia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "ResearchDegree{" +
                "id_stopnia=" + id_stopnia +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
