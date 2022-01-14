package br.com.studies.cityquery.infrastructure.repository;

import br.com.studies.cityquery.domain.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
