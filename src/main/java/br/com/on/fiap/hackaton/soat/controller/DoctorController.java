package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService service;


    @GetMapping
    public List<DoctorResponse> findAllByFilters(@RequestBody DoctorFindByFiltersRequest request) {
        return this.service.findAllByFilters(request);
    }

}
