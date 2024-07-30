package br.com.on.fiap.hackaton.soat.repository;

import br.com.on.fiap.hackaton.soat.domain.AppointmentStatus;
import br.com.on.fiap.hackaton.soat.domain.response.AppointmentResponse;
import br.com.on.fiap.hackaton.soat.entity.AppointmentEntity;
import br.com.on.fiap.hackaton.soat.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRespository extends JpaRepository<DoctorEntity, Long> {
    List<AppointmentEntity> findByCrmAndAppointment(String crm, List<AppointmentEntity> appointment);

    Optional<DoctorEntity> findByCrm(String crm);

}
