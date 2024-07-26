package br.com.on.fiap.hackaton.soat.entity;

import br.com.on.fiap.hackaton.soat.domain.Person;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Table(name = "doctor")
public class DoctorEntity extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor", nullable = false)
    private Long id;

    private String crm;

    private String specialty;

    @ManyToOne
    private AddressEntity address;

    @OneToMany
    private List<AppointmentEntity> appointments;

    private Double rate;

}
