package it.corradolombardi.refereeassistant.rs.v1;

import it.corradolombardi.refereeassistant.core.Season;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seasons")
public class SeasonsController {

//    https://www.baeldung.com/spring-hateoas-tutorial
//    https://www.baeldung.com/spring-hateoas-tutorial
    @GetMapping
    public ResponseEntity<CollectionModel<Season>> findAll() {

    }
}
