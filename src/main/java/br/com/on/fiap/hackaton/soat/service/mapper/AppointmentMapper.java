package br.com.on.fiap.hackaton.soat.service.mapper;

import br.com.on.fiap.hackaton.soat.domain.request.AppointmentRequest;
import br.com.on.fiap.hackaton.soat.domain.response.AppointmentResponse;
import br.com.on.fiap.hackaton.soat.entity.AppointmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppointmentMapper {

    AppointmentResponse entityToResponse(AppointmentEntity entity);
    AppointmentEntity requestToEntity(AppointmentRequest request);

}
