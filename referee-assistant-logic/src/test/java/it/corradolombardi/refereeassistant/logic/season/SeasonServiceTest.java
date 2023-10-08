package it.corradolombardi.refereeassistant.logic.season;


import it.corradolombardi.refereeassistant.core.Season;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class SeasonServiceTest {

    private SeasonService seasonService;
    private SeasonRepository seasonRepository = Mockito.mock(SeasonRepository.class);

    @Before
    public void setUp()  {
        seasonService = new SeasonService(seasonRepository);
    }

    @Test
    public void seasonCreated() {
        Season season = Season.builder().id("20232024")
                .starDate(LocalDate.of(2023, Month.JULY, 1))
                .endDate(LocalDate.of(2024, Month.JULY, 30))
                .build();
        Season createdSeason = seasonService.create(season);

        assertEquals(createdSeason, season);
        verify(seasonRepository).create(season);
    }
}