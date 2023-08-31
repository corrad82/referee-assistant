package it.corradolombardi.refereeassistant.rs.v1;

import it.corradolombardi.refereeassistant.core.Match;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "/matches")
public class MatchesController {


    @GetMapping
    public List<Match> findAll() {
        return Collections.emptyList();
    }
}
