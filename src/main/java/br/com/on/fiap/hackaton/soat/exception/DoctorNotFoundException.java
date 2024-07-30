package br.com.on.fiap.hackaton.soat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DoctorNotFoundException extends RuntimeException {

    public DoctorNotFoundException(String crm) {
        super(String.format("Médico com CRM %s inexistente!", crm));
    }

}
