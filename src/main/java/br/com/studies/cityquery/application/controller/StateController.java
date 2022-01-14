package br.com.studies.cityquery.application.controller;

import br.com.studies.cityquery.domain.model.State;
import br.com.studies.cityquery.infrastructure.repository.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/districties")
@RequiredArgsConstructor
public class StateController {

    private final StateRepository stateRepository;

    @GetMapping
    public Page<State> listAllContries(Pageable pageable) {
        return stateRepository.findAll(pageable);
    }
}
