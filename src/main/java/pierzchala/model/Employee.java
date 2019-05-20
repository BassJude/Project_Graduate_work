package pierzchala.model;

import org.hibernate.validator.constraints.NotBlank;
import pierzchala.validator.EditValidator;
import pierzchala.validator.RegistrationValidator;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pracownik")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pracownika;

    @Column(length = 50)
    @Size(max = 50, message = "Długość maksymalnie 50 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class}, message = "Wpisz imie")
    private String imie;

    @Column(length = 100)
    @Size(max = 100, message = "Długość maksymalnie 100 znaków", groups = {RegistrationValidator.class, EditValidator.class})
    @NotBlank(groups = {RegistrationValidator.class, EditValidator.class}, message = "Wpisz nazwisko")
    private String nazwisko;


}
