package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.domain.request.PatientRequest;
import br.com.on.fiap.hackaton.soat.domain.response.PatientResponse;
import br.com.on.fiap.hackaton.soat.service.PatientService;
import br.com.on.fiap.hackaton.soat.shared.EndpointPath;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(EndpointPath.PATIENT)
public class PatientController {

    private final PatientService service;

    @PostMapping
    public PatientResponse create(@RequestBody PatientRequest request) {
        return this.service.create(request);
    }

}
