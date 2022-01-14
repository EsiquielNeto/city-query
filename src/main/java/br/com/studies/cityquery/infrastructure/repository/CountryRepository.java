package br.com.studies.cityquery.infrastructure.repository;

import br.com.studies.cityquery.domain.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
