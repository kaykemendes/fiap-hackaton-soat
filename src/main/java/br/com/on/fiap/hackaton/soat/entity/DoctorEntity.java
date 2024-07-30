package br.com.on.fiap.hackaton.soat.entity;

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
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor", nullable = false)
    private Long id;

    private String name;

    @Column(unique=true)
    private String email;

    private String password;

    @Column(unique=true)
    private String crm;

    private String specialty;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private AddressEntity address;

    @OneToMany
    private List<AppointmentEntity> appointment;

    private Double rate;

}
