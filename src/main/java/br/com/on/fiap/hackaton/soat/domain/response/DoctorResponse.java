package br.com.on.fiap.hackaton.soat.domain.response;

import br.com.on.fiap.hackaton.soat.entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponse {

    private Long id;

    private String name;

    private String email;

    private String crm;

    private String specialty;

    private AddressResponse address;

}
