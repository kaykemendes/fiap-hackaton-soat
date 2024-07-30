package br.com.on.fiap.hackaton.soat.domain.request;

import br.com.on.fiap.hackaton.soat.domain.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentRequest {

    private Long id;

    private String date;

    private String hour;

    private AppointmentStatus status;

    private PatientRequest patient;

}
