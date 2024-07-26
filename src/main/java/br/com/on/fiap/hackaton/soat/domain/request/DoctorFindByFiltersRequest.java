package br.com.on.fiap.hackaton.soat.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorFindByFiltersRequest {

    private String specialty;

    private Double latitude;

    private Double longitude;

    private String rate;

}
