package br.com.studies.cityquery.domain.service;

import br.com.studies.cityquery.domain.model.City;
import br.com.studies.cityquery.infrastructure.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DistanceService {

    Logger log = LoggerFactory.getLogger(DistanceService.class);
    private final CityRepository cityRepository;

    public Double distanceByPointsinMillis(Long cityFrom, Long cityTo) {
        log.info("distance by points (cityFrom{}, cityfrom{})", cityFrom, cityTo);
        return cityRepository.distanceByPoints(cityFrom, cityTo);
    }

    public Double distanceByCube(Long cityFrom, Long cityTo) {
        log.info("distance by cube (cityFrom{}, cityfrom{})", cityFrom, cityTo);
        List<City> cities = cityRepository.findAllById(Arrays.asList(cityFrom, cityTo));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
