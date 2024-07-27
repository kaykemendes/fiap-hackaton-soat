package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.service.PatientService;
import br.com.on.fiap.hackaton.soat.shared.EndpointPath;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(EndpointPath.PATIENT_API)
public class PatientController {

    private final PatientService service;

}
