package it.corradolombardi.refereeassistant.core;

import lombok.AllArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public class Company {
    private final String affiliation;
    private final String name;
    private final Address address;
}
