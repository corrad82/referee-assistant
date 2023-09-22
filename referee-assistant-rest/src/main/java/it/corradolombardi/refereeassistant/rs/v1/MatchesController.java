package it.corradolombardi.refereeassistant.rs.v1;

import it.corradolombardi.refereeassistant.core.Match;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/matches")
public class MatchesController {

//    https://www.baeldung.com/spring-hateoas-tutorial

    @GetMapping
    public ResponseEntity<CollectionModel<Match>> findAll() {

        CollectionModel<Match> matches = CollectionModel.empty();
        return ResponseEntity.ok(matches);
    }
}
