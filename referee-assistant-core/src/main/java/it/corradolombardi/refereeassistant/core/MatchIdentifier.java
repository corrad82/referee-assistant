package it.corradolombardi.refereeassistant.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MatchIdentifier {
    private final League league;
    private final String number;
}
