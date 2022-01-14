package br.com.studies.cityquery.application.controller;

import br.com.studies.cityquery.domain.model.City;
import br.com.studies.cityquery.infrastructure.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityController {

    private final CityRepository cityRepository;

    @GetMapping
    public Page<City> listAllContries(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }
}
