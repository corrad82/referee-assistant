package it.corradolombardi.refereeassistant.core;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.time.LocalDateTime;

@Data
@Builder
//@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("match")
@Relation(collectionRelation = "matches")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Match extends RepresentationModel<Match> {
    private final MatchIdentifier matchIdentifier;
    private final LocalDateTime dateTime;
    private final Venue venue;

    private final Team homeTeam;
    private final Team visitingTeam;
}
