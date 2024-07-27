package br.com.on.fiap.hackaton.soat.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {

    private String crm;

    private String specialty;

    private AddressRequest address;

    private String name;

    private String email;

    private String password;

}
