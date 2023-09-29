package it.corradolombardi.refereeassistant.core;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Season {
    private final String id;
    private final LocalDate starDate;
    private final LocalDate endDate;
}
