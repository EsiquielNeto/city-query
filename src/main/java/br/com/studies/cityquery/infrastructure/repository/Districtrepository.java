package br.com.studies.cityquery.infrastructure.repository;

import br.com.studies.cityquery.domain.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Districtrepository extends JpaRepository<District, Long> {
}
