package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.shared.EndpointPath;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointPath.LOGIN)
@RequiredArgsConstructor
public class AuthController {


    @PostMapping("/doctor")
    public void loginDoctor() {}

    @PostMapping("/patient")
    public void loginPatient() {}

}
