package pierzchala.model;



import org.hibernate.validator.constraints.NotBlank;
import pierzchala.validator.EditValidator;
import pierzchala.validator.RegistrationValidator;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_studenta;

    @Column(length = 10)
    @Size(max = 10, message = "Długość maksymalnie 10 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class})
    @JoinColumn(unique =true)
    private  String numer_indeksu;

    @Column(length = 50)
    @Size(max = 50, message = "Długość maksymalnie 50 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class})
    String imie;

    @Column(length = 100)
    @Size(max = 100, message = "Długość maksymalnie 100 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class})
    String nazwisko;

    public Student() {
    }

    public Long getId_studenta() {
        return id_studenta;
    }

    public void setId_studenta(Long id_studenta) {
        this.id_studenta = id_studenta;
    }

    public String getNumer_indeksu() {
        return numer_indeksu;
    }

    public void setNumer_indeksu(String numer_indeksu) {
        this.numer_indeksu = numer_indeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_studenta=" + id_studenta +
                ", numer_indeksu='" + numer_indeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
