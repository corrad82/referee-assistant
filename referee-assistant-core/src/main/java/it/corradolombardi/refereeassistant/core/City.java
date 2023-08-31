package it.corradolombardi.refereeassistant.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class City {
    private final String zipCode;
    private final String name;
    private final String countryCode;
}
