package br.com.smartagenda.endpoint;

import br.com.smartagenda.model.Event;
import br.com.smartagenda.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("events")
public class EventEndpoint {
    private final EventRepository eventDAO;
    @Autowired
    public EventEndpoint(EventRepository eventDAO){
        this.eventDAO = eventDAO;
    }
    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>(eventDAO.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Event event){
        return new ResponseEntity<Object>(eventDAO.save(event), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        eventDAO.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Event event){
        eventDAO.save(event);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}
