package it.corradolombardi.refereeassistant.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public class Venue {
    private final String name;
    private final Address address;
}
