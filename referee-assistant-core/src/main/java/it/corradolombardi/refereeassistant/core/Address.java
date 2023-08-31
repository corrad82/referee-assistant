package it.corradolombardi.refereeassistant.core;

import lombok.AllArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public class Address {
    private final String street;
    private final String number;
    private final City city;
}
