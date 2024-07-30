package br.com.on.fiap.hackaton.soat.service.mapper;

import br.com.on.fiap.hackaton.soat.domain.request.DoctorRequest;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.entity.DoctorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        uses = {
                AddressMapper.class,
                AppointmentMapper.class
        }
)
public interface DoctorMapper {

    DoctorResponse entityToResponse(DoctorEntity entity);

    DoctorEntity requestToEntity(DoctorRequest request);
}
