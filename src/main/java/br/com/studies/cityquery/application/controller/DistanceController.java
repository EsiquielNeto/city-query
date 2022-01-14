package br.com.studies.cityquery.application.controller;

import br.com.studies.cityquery.domain.service.DistanceService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
@RequiredArgsConstructor
public class DistanceController {

    Logger log = LoggerFactory.getLogger(DistanceController.class);

    private final DistanceService distanceService;

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam("from") final Long cityFrom,
                           @RequestParam("to") final Long cityTo) {
        log.info("by-Points");
        return distanceService.distanceByPointsinMillis(cityFrom, cityTo);

    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam("from") final Long cityFrom,
                         @RequestParam("to") final Long cityTo) {
        log.info("by-Points");
        return distanceService.distanceByCube(cityFrom, cityTo);
    }

}
