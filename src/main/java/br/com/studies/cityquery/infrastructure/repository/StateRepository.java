package br.com.studies.cityquery.infrastructure.repository;

import br.com.studies.cityquery.domain.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
