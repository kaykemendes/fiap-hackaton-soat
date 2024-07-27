package br.com.on.fiap.hackaton.soat.service.mapper;

import br.com.on.fiap.hackaton.soat.domain.response.AddressResponse;
import br.com.on.fiap.hackaton.soat.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressResponse entityToResponse(AddressEntity entity);

}
