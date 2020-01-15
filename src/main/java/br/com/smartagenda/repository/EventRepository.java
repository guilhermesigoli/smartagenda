package br.com.smartagenda.repository;

import br.com.smartagenda.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
