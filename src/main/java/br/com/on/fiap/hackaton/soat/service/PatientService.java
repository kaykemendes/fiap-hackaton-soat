package br.com.on.fiap.hackaton.soat.service;

import br.com.on.fiap.hackaton.soat.domain.request.PatientRequest;
import br.com.on.fiap.hackaton.soat.domain.response.PatientResponse;
import br.com.on.fiap.hackaton.soat.repository.PatientRepository;
import br.com.on.fiap.hackaton.soat.service.mapper.PatientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository repository;
    private final PatientMapper mapper;

    public PatientResponse create(PatientRequest request) {
        var patientEntity = mapper.requestToEntity(request);
        return mapper.entityToResponse(repository.save(patientEntity));
    }


}
