package it.corradolombardi.refereeassistant.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Team {
    private String name;
    private Company company;
}
