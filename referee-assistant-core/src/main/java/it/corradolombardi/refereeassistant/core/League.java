package it.corradolombardi.refereeassistant.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class League {
    private final String code;
    private final Gender gender;
}
