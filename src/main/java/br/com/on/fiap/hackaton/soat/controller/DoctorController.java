package br.com.on.fiap.hackaton.soat.controller;

import br.com.on.fiap.hackaton.soat.domain.request.AppointmentRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.request.DoctorRequest;
import br.com.on.fiap.hackaton.soat.domain.response.AppointmentResponse;
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

    @GetMapping("/{crm}/agenda")
    public List<AppointmentResponse> findAvailableAppointments(
            @PathVariable(name = "crm") String crm,
            @RequestParam(name = "data") String data
    ) {
        return this.service.findAvailableAppointments(crm, data);
    }


    @PostMapping("/busca")
    public List<DoctorResponse> findAllByFilters(@RequestBody DoctorFindByFiltersRequest request) {
        return this.service.findAllByFilters(request);
    }

    @PutMapping("/{crm}/horarios")
    public void manageAppointment(
            @RequestBody AppointmentRequest request,
            @RequestParam(name = "crm") String crm
    ) {
        this.service.manageAppointment(request, crm);
    }

    @PostMapping
    public DoctorResponse create(@RequestBody DoctorRequest request) {
        return this.service.create(request);
    }

}
