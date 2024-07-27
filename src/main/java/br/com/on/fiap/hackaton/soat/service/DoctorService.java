package br.com.on.fiap.hackaton.soat.service;

import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorRequest;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.entity.DoctorEntity;
import br.com.on.fiap.hackaton.soat.repository.DoctorRespository;
import br.com.on.fiap.hackaton.soat.service.mapper.DoctorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRespository respository;
    private final DoctorMapper mapper;

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

//        TODO: implementar busca por distância
//        if(Objects.nonNull(request.getLatitude()) && Objects.nonNull(request.getLongitude())) {
//            doctor.getAddress();
//        }

         return respository.findAll(Example.of(doctor))
                 .stream()
                 .map(mapper::entityToResponse)
                 .collect(Collectors.toList());
    }

    public DoctorResponse create(DoctorRequest request) {
        var doctorEntity = mapper.requestToEntity(request);
        return mapper.entityToResponse(this.respository.save(doctorEntity));
    }

}
