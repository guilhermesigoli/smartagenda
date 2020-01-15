package br.com.smartagenda.endpoint;

import br.com.smartagenda.model.User;
import br.com.smartagenda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserEndpoint {
    private final UserRepository userDAO;
    @Autowired
    public UserEndpoint(UserRepository userDAO){
        this.userDAO = userDAO;
    }
    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>(userDAO.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        return new ResponseEntity<Object>(userDAO.save(user), HttpStatus.OK);
    }
}

