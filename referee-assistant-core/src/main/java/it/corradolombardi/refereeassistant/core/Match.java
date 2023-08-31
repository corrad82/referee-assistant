package it.corradolombardi.refereeassistant.core;


import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Match {
    private final MatchIdentifier matchIdentifier;
    private final LocalDateTime dateTime;
    private final Venue venue;

    private final Team homeTeam;
    private final Team visitingTeam;
}
