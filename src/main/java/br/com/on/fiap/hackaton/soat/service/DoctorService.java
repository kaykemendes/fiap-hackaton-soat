package br.com.on.fiap.hackaton.soat.service;

import br.com.on.fiap.hackaton.soat.domain.AppointmentStatus;
import br.com.on.fiap.hackaton.soat.domain.request.AppointmentRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorRequest;
import br.com.on.fiap.hackaton.soat.domain.response.AppointmentResponse;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.entity.AppointmentEntity;
import br.com.on.fiap.hackaton.soat.entity.DoctorEntity;
import br.com.on.fiap.hackaton.soat.exception.DoctorNotFoundException;
import br.com.on.fiap.hackaton.soat.repository.DoctorRespository;
import br.com.on.fiap.hackaton.soat.service.mapper.AppointmentMapper;
import br.com.on.fiap.hackaton.soat.service.mapper.DoctorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRespository respository;
    private final DoctorMapper doctorMapper;
    private final AppointmentMapper appointmentMapper;

    public List<DoctorResponse> findAllByFilters(DoctorFindByFiltersRequest request) {

        var doctor = new DoctorEntity();

        if (Objects.nonNull(request.getName())) {
            doctor.setName(request.getName());
        }

        if (Objects.nonNull(request.getRate())) {
            doctor.setRate(request.getRate());
        }

        if(Objects.nonNull(request.getSpecialty())) {
            doctor.setSpecialty(request.getSpecialty());
        }


         return respository.findAll(Example.of(doctor))
                 .stream()
                 .map(doctorMapper::entityToResponse)
                 .collect(Collectors.toList());
    }

    public DoctorResponse create(DoctorRequest request) {
        var doctorEntity = doctorMapper.requestToEntity(request);
        return doctorMapper.entityToResponse(this.respository.save(doctorEntity));
    }

    public List<AppointmentResponse> findAvailableAppointments(String crm, String data) {
        var appointment = new AppointmentEntity();
        appointment.setStatus(AppointmentStatus.AVAILABLE);
        appointment.setDate(data);

        return this.respository.findByCrmAndAppointment(crm, List.of(appointment))
                .stream()
                .map(appointmentMapper::entityToResponse)
                .collect(Collectors.toList());
    }

    public void manageAppointment(AppointmentRequest request, String crm) {

        var doctor = this.respository.findByCrm(crm).orElseThrow(() -> new DoctorNotFoundException(crm));
        var appointEntity = appointmentMapper.requestToEntity(request);

        if (Objects.isNull(doctor.getAppointment()) || doctor.getAppointment().isEmpty()) {
            doctor.setAppointment(Collections.singletonList(appointEntity));

        } else {
            doctor.getAppointment().add(appointEntity);
        }

        this.respository.saveAndFlush(doctor);

    }
}
