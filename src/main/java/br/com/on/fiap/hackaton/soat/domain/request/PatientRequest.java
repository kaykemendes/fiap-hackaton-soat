package br.com.on.fiap.hackaton.soat.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequest {

    private Long id;

    private String cpf;

    private String name;

    private String email;

    private String password;

}
