package br.com.on.fiap.hackaton.soat.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {

    private String cpf;

    private String name;

    private String email;

}
