package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorRequest;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.service.DoctorService;
import br.com.on.fiap.hackaton.soat.shared.EndpointPath;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EndpointPath.DOCTOR)
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService service;


    @PostMapping("/find")
    public List<DoctorResponse> findAllByFilters(@RequestBody DoctorFindByFiltersRequest request) {
        return this.service.findAllByFilters(request);
    }

    @PostMapping
    public DoctorResponse create(@RequestBody DoctorRequest request) {
        return this.service.create(request);
    }

}
