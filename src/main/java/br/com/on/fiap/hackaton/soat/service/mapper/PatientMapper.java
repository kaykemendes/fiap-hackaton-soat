package br.com.on.fiap.hackaton.soat.service.mapper;

import br.com.on.fiap.hackaton.soat.domain.request.PatientRequest;
import br.com.on.fiap.hackaton.soat.domain.response.PatientResponse;
import br.com.on.fiap.hackaton.soat.entity.PatientEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PatientMapper {
    PatientEntity requestToEntity(PatientRequest request);
    PatientResponse entityToResponse(PatientEntity save);
}

