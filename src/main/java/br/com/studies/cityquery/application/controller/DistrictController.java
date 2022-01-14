package br.com.studies.cityquery.application.controller;

import br.com.studies.cityquery.domain.model.District;
import br.com.studies.cityquery.infrastructure.repository.Districtrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/districties")
@RequiredArgsConstructor
public class DistrictController {

    private final Districtrepository districtrepository;

    @GetMapping
    public Page<District> listAllContries(Pageable pageable) {
        return districtrepository.findAll(pageable);
    }
}
