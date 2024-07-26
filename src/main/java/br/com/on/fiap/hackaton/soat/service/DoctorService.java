package br.com.on.fiap.hackaton.soat.service;

import br.com.on.fiap.hackaton.soat.domain.request.DoctorFindByFiltersRequest;
import br.com.on.fiap.hackaton.soat.domain.response.DoctorResponse;
import br.com.on.fiap.hackaton.soat.repository.DoctorRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRespository respository;

    public List<DoctorResponse> findAllByFilters(DoctorFindByFiltersRequest request) {
        return null;
    }

}
