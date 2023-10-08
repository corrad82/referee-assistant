package it.corradolombardi.refereeassistant.logic.season;

import it.corradolombardi.refereeassistant.core.Season;

public class SeasonService {
    private final SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public Season create(Season season) {
        seasonRepository.create(season);
        return season;
    }
}
